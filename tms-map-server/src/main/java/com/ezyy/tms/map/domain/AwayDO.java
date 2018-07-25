package com.ezyy.tms.map.domain;

import java.io.Serializable;
import java.util.Date;

import com.ezyy.tms.map.pojo.MapAway;

public class AwayDO implements Serializable,Comparable<AwayDO>{
    private static final long serialVersionUID = 1L;
    //时间 秒
    private int duration;
    //距离 米
    private int distance;
    //经纬度点连接 格式："28.892779,121.187782","28.892510,121.187852","28.892400,121.187872"
    private String path;
    private PointDO originPointDO;
    private PointDO destinationPointDO;
    private Date credate;
    private int policy;

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public PointDO getOriginPointDO() {
        return originPointDO;
    }

    public void setOriginPointDO(PointDO originPointDO) {
        this.originPointDO = originPointDO;
    }

    public PointDO getDestinationPointDO() {
        return destinationPointDO;
    }

    public void setDestinationPointDO(PointDO destinationPointDO) {
        this.destinationPointDO = destinationPointDO;
    }
    
	public int getPolicy() {
		return policy;
	}

	public void setPolicy(int policy) {
		this.policy = policy;
	}

	

	public Date getCredate() {
		return credate;
	}

	public void setCredate(Date credate) {
		this.credate = credate;
	}

	@Override
	public int compareTo(AwayDO awayDO) {
		 int cop = distance - awayDO.getDistance();
	       if (cop != 0)
	           return cop;
	       else
	           return duration-awayDO.getDuration();
	}
	
	public MapAway toMapAway() {
		MapAway mapAway=new MapAway();
		mapAway.setPath(path);
		mapAway.setDestination(destinationPointDO.toString());
		mapAway.setOrigin(originPointDO.toString());
		mapAway.setPolicy(policy);
		mapAway.setDistance(distance);
		mapAway.setDuration(duration);
		mapAway.setCredate(credate);
		return mapAway;
	}

}
