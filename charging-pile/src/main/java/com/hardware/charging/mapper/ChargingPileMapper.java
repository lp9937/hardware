package com.hardware.charging.mapper;

import com.hardware.charging.pojo.model.ChargingPile;
import com.hardware.charging.pojo.model.ChargingPileExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ChargingPileMapper {
    long countByExample(ChargingPileExample example);

    int deleteByExample(ChargingPileExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ChargingPile record);

    int insertSelective(ChargingPile record);

    List<ChargingPile> selectByExample(ChargingPileExample example);

    ChargingPile selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ChargingPile record, @Param("example") ChargingPileExample example);

    int updateByExample(@Param("record") ChargingPile record, @Param("example") ChargingPileExample example);

    int updateByPrimaryKeySelective(ChargingPile record);

    int updateByPrimaryKey(ChargingPile record);
}