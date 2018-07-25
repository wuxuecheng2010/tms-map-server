package com.ezyy.tms.map.service.impl;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ezyy.tms.map.domain.AwayDO;
import com.ezyy.tms.map.domain.PointDO;
import com.ezyy.tms.map.enums.FarNearMod;
import com.ezyy.tms.map.mapper.MapAwayMapper;
import com.ezyy.tms.map.pojo.MapAway;
import com.ezyy.tms.map.pojo.MapAwayExample;
import com.ezyy.tms.map.pojo.MapAwayExample.Criteria;
import com.ezyy.tms.map.service.MapService;
import com.ezyy.tms.map.utils.DateHelper;
import com.ezyy.tms.map.utils.HttpRequest;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

@Service
public class MapServiceImpl implements MapService {
	
	@Autowired
	MapAwayMapper mapAwayMapper;
	
    /**
     * 获取2点间的距离、时间、路径信息（参考驾车策略）
     * @param policy      驾车策略 0:默认   3:不走高速
     * @param origin      40.056878,116.30815
     * @param destination 31.222965,121.505821
     * @return
     */
    @Override
    public AwayDO getTwoPointAway(int policy, String origin, String destination) {
    	AwayDO awayDO = null;
    	//1、检查是否有保存的点对点线路
    	MapAwayExample example=new MapAwayExample();
		Criteria criteria=example.createCriteria();
		criteria.andOriginEqualTo(origin);
		criteria.andDestinationEqualTo(destination);
		criteria.andStopflagEqualTo(0);
		criteria.andPolicyEqualTo(0);
		criteria.andCredateGreaterThan(DateHelper.getDateBefore(new Date(), 45));
		List<MapAway> list=mapAwayMapper.selectByExample(example);
		if(list!=null && list.size()>0) {
			MapAway mapAway=list.get(0);
			awayDO=mapAway.toAwayDO();
		}else {
			//2、没有现成的则去百度上找
	        StringBuilder builder = new StringBuilder();
	        builder.append("ak=").append(ak)
	                .append("&origin=").append(origin)
	                .append("&destination=").append(destination)
	                .append("&tactics=").append(policy);
	        String params = builder.toString();
	        String result = HttpRequest.sendGet(url, params);
	        JSONObject jso = JSON.parseObject(result);
	        int status = jso.getIntValue("status");
	        if (status == 0) {
	            JSONObject route0 = ((JSONObject) jso.getJSONObject("result").getJSONArray("routes").get(0));
	            int duration = route0.getIntValue("duration");
	            int distance = route0.getIntValue("distance");
	            JSONArray steps = route0.getJSONArray("steps");
	            String path = "";
	            for (int i = 0; i < steps.size(); i++) {
	                path += steps.getJSONObject(i).getString("path");
	            }
	            awayDO = new AwayDO();
	            awayDO.setDistance(distance);
	            awayDO.setDuration(duration);
	            awayDO.setPath(path);
	            PointDO originPointDO=PointDO.getPointDOFromString(origin);
	            PointDO destinationPointDO=PointDO.getPointDOFromString(destination);
	            awayDO.setOriginPointDO(originPointDO);
	            awayDO.setDestinationPointDO(destinationPointDO);
	            awayDO.setPolicy(policy);
	            //3、保存线路信息
	            MapAway mapAway=awayDO.toMapAway(); 
	            mapAway.setCredate(new Date());
	            mapAway.setStopflag(0);
	            mapAwayMapper.insert(mapAway);
	        }
		}
        
        return awayDO;
    }

    @Override
    public AwayDO getTwoPointAway(int policy, PointDO originPointDO, PointDO destinationPointDO) {
        String origin = originPointDO.toString();
        String destination = destinationPointDO.toString();
        AwayDO awayDO = this.getTwoPointAway(policy, origin, destination);
        awayDO.setOriginPointDO(originPointDO);
        awayDO.setDestinationPointDO(destinationPointDO);
        return awayDO;
    }
    
	@Override
	public List<AwayDO> getOnePointToArrayPointAway(int policy, PointDO originPointDO, List<PointDO> pointList) {
		List<AwayDO> list=new ArrayList<AwayDO>();
		for(PointDO point: pointList) {
			AwayDO awayDO=getTwoPointAway(policy,originPointDO,point);
			list.add(awayDO);
		}
		return list;
	}

	@Override
	public List<AwayDO> getAwayDOOrder(PointDO originPointDO, List<PointDO> pointDOList, int policy, FarNearMod farnearmod,
			List<AwayDO> awayDOList) {
        if(pointDOList!=null && pointDOList.size()>0) {
        	List<AwayDO> _awayDOList=new  ArrayList<AwayDO>();//临时保存一个点到很多点的路径信息
        	for(PointDO point: pointDOList) {
    			AwayDO awayDO=getTwoPointAway(policy,originPointDO,point);
    			_awayDOList.add(awayDO);
    		}
        	Collections.sort(_awayDOList);//按照AwayDO实现的Compareable接口规则排序
        	AwayDO _awayDO=_awayDOList.get(0);
        	awayDOList.add(_awayDO);
        	//获取已经存放的点  并且做为下次排序的起点
        	PointDO _point=_awayDO.getDestinationPointDO();
        	int index=pointDOList.indexOf(_point);
        	//移除本次已经获选的点 
        	pointDOList.remove(index);
        	getAwayDOOrder(_point,pointDOList,policy,farnearmod,awayDOList);
        }
		return awayDOList;
	}

}
