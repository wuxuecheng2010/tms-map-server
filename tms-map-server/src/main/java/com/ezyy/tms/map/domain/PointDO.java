package com.ezyy.tms.map.domain;

import java.io.Serializable;

/**
 * 最简单的单纯的表示地理位置
 */
public class PointDO implements Serializable {
    private static final long serialVersionUID = 1L;
   // private String transid;//运输地址
    private String lng;//经度 121.150982
    private String lat;//纬度 28.813728



    public PointDO() {
    }

    public PointDO( String lat ,String lng) {
        this.lng = lng;
        this.lat = lat;
    }

    public String getLng() {
        return lng;
    }

    public void setLng(String lng) {
        this.lng = lng;
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    
/*    public String getTransid() {
        return transid;
    }

    public void setTransid(String transid) {
        this.transid = transid;
    }*/


	@Override
    public String toString() {
        StringBuilder builder =new StringBuilder();
        return builder.append(lat)
                .append(",")
                .append(lng)
                .toString();
    }
	
	
	
	/**
	 * 
	* @Title: getPointDOFromString
	* @Description: 将字符串经纬度转化成PointDO对象
	* @param @param locationstr
	* @param @return    参数
	* @author wuxuecheng
	* @return PointDO    返回类型
	* @throws
	 */
	public static PointDO getPointDOFromString(String locationstr) {
		String[] latlgn=locationstr.split(",");
		PointDO point=new PointDO(latlgn[0],latlgn[1]);
		return point;
	}


}
