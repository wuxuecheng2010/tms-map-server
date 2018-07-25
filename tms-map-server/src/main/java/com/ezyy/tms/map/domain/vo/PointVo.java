package com.ezyy.tms.map.domain.vo;

import javax.persistence.Entity;

import com.ezyy.tms.map.domain.PointDO;

import lombok.Data;

@Entity
@Data
public class PointVo {

	private PointDO pointdo;
	private int priority;

}
