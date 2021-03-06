package com.ezyy.tms.map.service;



import java.util.List;

import com.ezyy.tms.map.domain.AwayDO;
import com.ezyy.tms.map.domain.PointDO;
import com.ezyy.tms.map.enums.FarNearMod;

public interface MapService {
	
	//地图地址
    public static final String url = "http://api.map.baidu.com/direction/v2/driving";
    
    //ak
    public static final String ak = "Rw6UFU3rh1zeLKLYXAixeyjBEutv4nX8";


    /**
     * 获取2点间的距离、时间、路径信息（参考驾车策略）
     *
     * @param policy      驾车策略 0:默认   3:不走高速
     * @param origin      40.056878,116.30815
     * @param destination 31.222965,121.505821
     * @return
     */
    public AwayDO getTwoPointAway(int policy, String origin, String destination);
    public AwayDO getTwoPointAway(int policy, PointDO originPointDO,PointDO destinationPointDO);
    /**
     * 
    * @Title: getOnePointToArrayPointAway
    * @Description: 获取1点到多点的路径集合
    * @param @param policy
    * @param @param originPointDO
    * @param @param pointList
    * @param @return    参数
    * @author wuxuecheng
    * @return List<AwayDO>    返回类型
    * @throws
     */
    public List<AwayDO> getOnePointToArrayPointAway(int policy, PointDO originPointDO,List<PointDO> pointList);

   
    /**
     * 
    * @Title: getTransOrder
    * @Description: 一个点到一系列点的顺序计算
    * @param @param originPointDO
    * @param @param list
    * @param @param policy
    * @param @param farnearmod
    * @param @return    参数
    * @author wuxuecheng
    * @return List<AwayDO>    返回类型
    * @throws
     */
    public List<PointDO> getPointDOOrder(PointDO originPointDO,List<PointDO> pointDOList,int policy,FarNearMod farnearmod,List<PointDO> orderedPointDOList);

    
    /**
     * 一个点到一系列点的路线信息
    * @Title: getAwayDOOrder
    * @Description: TODO(一个点到一系列点的路线信息)
    * @param @param originPointDO  起点
    * @param @param orderedPointDOList  目的暗点列表
    * @param @param policy  策略
    * @param @param farnearmod  由远及近还是由近及远
    * @param @param awayDOList  存放排序后的路径信息
    * @param @return    排序后的路径
    * @author wuxuecheng
    * @return List<AwayDO>    返回类型
    * @throws
     */
    public List<AwayDO> getAwayDOOrder(PointDO originPointDO,List<PointDO> orderedPointDOList,int policy,FarNearMod farnearmod,List<AwayDO> awayDOList);

    /**
     * 排序好的点的线路信息
    * @Title: getAwayDOOrder
    * @Description: TODO(排序好的点的线路信息)
    * @param @param orderedPointDOList  排序好的点的队列
    * @param @param policy  策略
    * @param @param farnearmod  由远及近还是由近及远
    * @param @param awayDOList  存放排序后的路径信息
    * @param @return    排序后的路径
    * @author wuxuecheng
    * @return List<AwayDO>    返回类型
    * @throws
     */
    public List<AwayDO> getAwayDOOrder(List<PointDO> orderedPointDOList,int policy,FarNearMod farnearmod,List<AwayDO> awayDOList);


}
