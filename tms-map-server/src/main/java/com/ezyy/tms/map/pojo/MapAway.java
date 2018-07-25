package com.ezyy.tms.map.pojo;

import java.util.Date;

import com.ezyy.tms.map.domain.AwayDO;
import com.ezyy.tms.map.domain.PointDO;

public class MapAway {
    private Integer wayid;

    private String origin;

    private String destination;

    private Integer duration;

    private Integer distance;

    private String path;

    private Integer policy;

    private Date credate;

    private Integer stopflag;

    public Integer getWayid() {
        return wayid;
    }

    public void setWayid(Integer wayid) {
        this.wayid = wayid;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin == null ? null : origin.trim();
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination == null ? null : destination.trim();
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public Integer getDistance() {
        return distance;
    }

    public void setDistance(Integer distance) {
        this.distance = distance;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path == null ? null : path.trim();
    }

    public Integer getPolicy() {
        return policy;
    }

    public void setPolicy(Integer policy) {
        this.policy = policy;
    }

    public Date getCredate() {
        return credate;
    }

    public void setCredate(Date credate) {
        this.credate = credate;
    }

    public Integer getStopflag() {
        return stopflag;
    }

    public void setStopflag(Integer stopflag) {
        this.stopflag = stopflag;
    }

	public AwayDO toAwayDO() {
		AwayDO awayDO=new AwayDO();
		awayDO.setCredate(this.credate);
		awayDO.setDestinationPointDO(PointDO.getPointDOFromString(this.destination));
		awayDO.setDistance(this.distance);
		awayDO.setDuration(this.duration);
		awayDO.setOriginPointDO(PointDO.getPointDOFromString(this.origin));
		awayDO.setPath(this.path);
		awayDO.setPolicy(this.policy);
		return awayDO;
	}
}