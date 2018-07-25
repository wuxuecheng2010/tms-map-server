package com.ezyy.tms.map.mapper;

import static org.junit.Assert.*;

import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.ezyy.tms.map.pojo.MapAway;
import com.ezyy.tms.map.pojo.MapAwayExample;
import com.ezyy.tms.map.pojo.MapAwayExample.Criteria;
import com.ezyy.tms.map.service.impl.MapServiceImplTest;
import com.ezyy.tms.map.utils.DateHelper;

import lombok.extern.java.Log;

@RunWith(SpringRunner.class)
@SpringBootTest
@Log
public class MapAwayMapperTest {
	
	@Autowired
	MapAwayMapper mapAwayMapper;

	@Test
	public void testCountByExample() {
		//MapAwayExample example=new MapAwayExample();
		
	}

	@Test
	public void testDeleteByExample() {
		fail("Not yet implemented");
	}

	@Test
	public void testDeleteByPrimaryKey() {
		fail("Not yet implemented");
	}

	@Test
	public void testInsert() {
		
		MapAway record=new MapAway();
		
		record.setDestination("124,30");
		record.setDistance(100);
		record.setDuration(200);
		record.setOrigin("12.35,223");
		record.setPath("12.232323232");
		record.setPolicy(0);
		record.setStopflag(0);
		record.setCredate(new Date());
		mapAwayMapper.insert(record);
	}

	@Test
	public void testInsertSelective() {
		fail("Not yet implemented");
	}

	@Test
	public void testSelectByExample() {
		
		MapAwayExample example=new MapAwayExample();
		Criteria criteria=example.createCriteria();
		criteria.andOriginEqualTo("28.812285,121.150628");
		criteria.andDestinationEqualTo("28.85342,121.120283");
		criteria.andStopflagEqualTo(0);
		criteria.andPolicyEqualTo(0);
		criteria.andCredateGreaterThan(DateHelper.getDateBefore(new Date(), 45));
		List<MapAway> list=mapAwayMapper.selectByExample(example);
		System.out.println(list.size());
		
	}

	@Test
	public void testSelectByPrimaryKey() {
		fail("Not yet implemented");
	}

	@Test
	public void testUpdateByExampleSelective() {
		fail("Not yet implemented");
	}

	@Test
	public void testUpdateByExample() {
		fail("Not yet implemented");
	}

	@Test
	public void testUpdateByPrimaryKeySelective() {
		fail("Not yet implemented");
	}

	@Test
	public void testUpdateByPrimaryKey() {
		fail("Not yet implemented");
	}

}
