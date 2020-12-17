package com.hardware.charging.mapper;

import com.hardware.charging.mapper.base.BaseMapper;
import com.hardware.charging.pojo.model.ChargingRule;
import com.hardware.charging.pojo.model.ChargingRuleExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface ChargingRuleMapper
        extends BaseMapper<ChargingRule> {
    long countByExample(ChargingRuleExample example);

    int deleteByExample(ChargingRuleExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ChargingRule record);

    int insertSelective(ChargingRule record);

    List<ChargingRule> selectByExample(ChargingRuleExample example);

    ChargingRule selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ChargingRule record, @Param("example") ChargingRuleExample example);

    int updateByExample(@Param("record") ChargingRule record, @Param("example") ChargingRuleExample example);

    int updateByPrimaryKeySelective(ChargingRule record);

    int updateByPrimaryKey(ChargingRule record);
}