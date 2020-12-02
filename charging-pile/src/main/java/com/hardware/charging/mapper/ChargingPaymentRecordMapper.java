package com.hardware.charging.mapper;

import com.hardware.charging.pojo.model.ChargingPaymentRecord;
import com.hardware.charging.pojo.model.ChargingPaymentRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ChargingPaymentRecordMapper {
    long countByExample(ChargingPaymentRecordExample example);

    int deleteByExample(ChargingPaymentRecordExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ChargingPaymentRecord record);

    int insertSelective(ChargingPaymentRecord record);

    List<ChargingPaymentRecord> selectByExample(ChargingPaymentRecordExample example);

    ChargingPaymentRecord selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ChargingPaymentRecord record, @Param("example") ChargingPaymentRecordExample example);

    int updateByExample(@Param("record") ChargingPaymentRecord record, @Param("example") ChargingPaymentRecordExample example);

    int updateByPrimaryKeySelective(ChargingPaymentRecord record);

    int updateByPrimaryKey(ChargingPaymentRecord record);
}