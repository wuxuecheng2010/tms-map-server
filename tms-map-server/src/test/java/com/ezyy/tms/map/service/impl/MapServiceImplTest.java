package com.ezyy.tms.map.service.impl;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.ezyy.tms.map.domain.AwayDO;
import com.ezyy.tms.map.domain.PointDO;
import com.ezyy.tms.map.enums.FarNearMod;
import com.ezyy.tms.map.service.MapService;
import com.ezyy.tms.map.utils.HttpRequest;

import lombok.extern.java.Log;

@RunWith(SpringRunner.class)
@SpringBootTest
@Log
public class MapServiceImplTest {

	@Autowired
	MapService mapService;

	@Test
	public void testGetMapSearchResultIntStringString() {
		/*AwayDO mapSearchResultDO = mapService.getMapSearchResult(0, "40.056878,116.30815",
				"31.222965,121.505821");
		Assert.assertFalse(mapSearchResultDO == null);*/
		
		
		List<AwayDO> list=new ArrayList<AwayDO>();
		for(int i=0;i<20;i++) {
			int x=(int)( Math.random()*100);
			log.info("x:"+x);
			AwayDO awayDO=new AwayDO();
			awayDO.setDistance(x);
			awayDO.setDuration(300);
			list.add(awayDO);
		}
		
		Collections.sort(list);
		
		
		for(int i=0;i<list.size();i++) {
			
			log.info("x--:"+list.get(i).getDistance());
		}
		
		
	}
	
	
	@Test	
	public void testGetTwoPointAway() {
		//PointDO originPointDO=PointDO.getPointDOFromString("121.150628,28.812285");//物流中心
		//PointDO disPointDO=PointDO.getPointDOFromString("121.120283,28.85342");//台州医院
		AwayDO awayDO=mapService.getTwoPointAway( 0,  "28.812285,121.150628",  "28.85342,121.120283");
		//log.info(awayDO.toString());
		//Assert.assertFalse(awayDO!=null);
		System.out.println(awayDO);
		
		/*String result = HttpRequest.sendGet("http://api.map.baidu.com/direction/v2/driving", "ak=Rw6UFU3rh1zeLKLYXAixeyjBEutv4nX8&origin=28.812285,121.150628&destination=28.85342,121.120283&tactics=0");
		System.out.println(result);*/
	}
	

	@Test
	public void testGetTransOrder() {
		
		PointDO originPointDO=PointDO.getPointDOFromString("28.812285,121.150628");//物流中心
		
		List<PointDO> pointDOList=new ArrayList<PointDO>();
		pointDOList.add(PointDO.getPointDOFromString("28.85342,121.120283"));//台州医院
		pointDOList.add(PointDO.getPointDOFromString("28.854875,121.136094"));//教育局
		pointDOList.add(PointDO.getPointDOFromString("28.861708,121.147592"));//银泰
		pointDOList.add(PointDO.getPointDOFromString("28.870249,121.159809"));//吉利汽车
		pointDOList.add(PointDO.getPointDOFromString("28.868604,121.175619"));//华侨
		pointDOList.add(PointDO.getPointDOFromString("28.874867,121.190495"));//台州中学
		pointDOList.add(PointDO.getPointDOFromString("28.903266,121.20494"));//大田骨伤科
		pointDOList.add(PointDO.getPointDOFromString("28.941267,121.263006"));//东城屈家
		List<AwayDO> awayDOList=new ArrayList<AwayDO>();
		awayDOList=mapService.getAwayDOOrder(originPointDO, pointDOList, 0, FarNearMod.NEAR, awayDOList);
		Assert.assertFalse(awayDOList.size()==pointDOList.size());
	}


}
