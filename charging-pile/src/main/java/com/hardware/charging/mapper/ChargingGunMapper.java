package com.hardware.charging.mapper;

import com.hardware.charging.mapper.base.BaseMapper;
import com.hardware.charging.pojo.model.ChargingGun;
import com.hardware.charging.pojo.model.ChargingGunExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface ChargingGunMapper
        extends BaseMapper<ChargingGun> {
    long countByExample(ChargingGunExample example);

    int deleteByExample(ChargingGunExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ChargingGun record);

    int insertSelective(ChargingGun record);

    List<ChargingGun> selectByExample(ChargingGunExample example);

    ChargingGun selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ChargingGun record, @Param("example") ChargingGunExample example);

    int updateByExample(@Param("record") ChargingGun record, @Param("example") ChargingGunExample example);

    int updateByPrimaryKeySelective(ChargingGun record);

    int updateByPrimaryKey(ChargingGun record);
}