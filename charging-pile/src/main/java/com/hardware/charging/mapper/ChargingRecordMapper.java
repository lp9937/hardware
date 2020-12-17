package com.hardware.charging.mapper;

import com.hardware.charging.mapper.base.BaseMapper;
import com.hardware.charging.pojo.model.ChargingRecord;
import com.hardware.charging.pojo.model.ChargingRecordExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface ChargingRecordMapper
        extends BaseMapper<ChargingRecord> {
    long countByExample(ChargingRecordExample example);

    int deleteByExample(ChargingRecordExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ChargingRecord record);

    int insertSelective(ChargingRecord record);

    List<ChargingRecord> selectByExample(ChargingRecordExample example);

    ChargingRecord selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ChargingRecord record, @Param("example") ChargingRecordExample example);

    int updateByExample(@Param("record") ChargingRecord record, @Param("example") ChargingRecordExample example);

    int updateByPrimaryKeySelective(ChargingRecord record);

    int updateByPrimaryKey(ChargingRecord record);
}