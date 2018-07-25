package com.ezyy.tms.map.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ezyy.tms.map.domain.AwayDO;
import com.ezyy.tms.map.domain.PointDO;
import com.ezyy.tms.map.service.MapService;

@RestController
@RequestMapping("/map")
public class MapController {

	@Autowired
	MapService mapService;

	/**
	 * 
	* @Title: test
	* @Description: TODO(这里用一句话描述这个方法的作用)
	* @param @return    参数
	* @author wuxuecheng
	* @return AwayDO    返回类型
	* @throws nothing
	 */
	@RequestMapping(value = "test", method = RequestMethod.GET)
	public AwayDO test() {
		AwayDO awayDO = mapService.getTwoPointAway(0, "28.812285,121.150628", "28.85342,121.120283");
		return awayDO;
	}
	

	/**
	 * 
	* @Title: pointToPotintPath
	* @Description: 查询点对点的路径信息  包含时间、距离、经纬度数组
	* @param @param origin   起点
	* @param @param destination 目的点
	* @param @param policy 策略
	* @param @return    参数
	* @author wuxuecheng
	* @return AwayDO    返回类型
	* @throws
	 */
	@RequestMapping(value = "/ptp/{origin}/{destination}/{policy}", method = RequestMethod.GET)
	public AwayDO pointToPotintPath(@PathVariable(value = "origin", required = true) String origin,
			@PathVariable(value = "destination", required = true) String destination,
			@PathVariable(value = "policy", required = true) int policy) {

		return mapService.getTwoPointAway(policy, origin, destination);
	}
	
	/**
	 * 
	* @Title: pointToPointListPath
	* @Description: 查询点对点列表的路径信息  包含时间、距离、经纬度数组等信息
	* @param @param origin      起点
	* @param @param destinations  目的点列表
	* @param @param policy  策略
	* @param @return    参数
	* @author wuxuecheng
	* @return List<AwayDO>    返回类型
	* @throws
	 */
	@RequestMapping(value = "/ptpl/{origin}/{destinations}/{policy}", method = RequestMethod.GET)
	public List<AwayDO> pointToPointListPath(
			@PathVariable(value="origin",required=true)String origin,
			@PathVariable(value="destinations",required=true)String destinations ,
			@PathVariable(value="policy",required=true)int policy){
		
		String[] destinationList=destinations.split("\\|");
		List<PointDO> pointDOList=new ArrayList<PointDO>();
		for(String destination: destinationList) {
			pointDOList.add(PointDO.getPointDOFromString(destination));
		}
		return mapService.getOnePointToArrayPointAway(policy,PointDO.getPointDOFromString(origin) , pointDOList);
	}

}
