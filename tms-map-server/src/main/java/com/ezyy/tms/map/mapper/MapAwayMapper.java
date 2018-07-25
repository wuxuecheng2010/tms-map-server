package com.ezyy.tms.map.mapper;

import com.ezyy.tms.map.pojo.MapAway;
import com.ezyy.tms.map.pojo.MapAwayExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MapAwayMapper {
    int countByExample(MapAwayExample example);

    int deleteByExample(MapAwayExample example);

    int deleteByPrimaryKey(Integer wayid);

    int insert(MapAway record);

    int insertSelective(MapAway record);

    List<MapAway> selectByExample(MapAwayExample example);

    MapAway selectByPrimaryKey(Integer wayid);

    int updateByExampleSelective(@Param("record") MapAway record, @Param("example") MapAwayExample example);

    int updateByExample(@Param("record") MapAway record, @Param("example") MapAwayExample example);

    int updateByPrimaryKeySelective(MapAway record);

    int updateByPrimaryKey(MapAway record);
}