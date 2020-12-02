package com.hardware.server.service.charging.message.body.server;

import com.hardware.common.enums.CommandEnum;
import com.hardware.server.service.charging.constant.MessageFieldConst;
import io.netty.buffer.ByteBuf;

/**
 * Created by lp on 2020/12/01
 * 充电桩电费计价策略设置
 */
public class ElectricityPricingStrategyServerMessageBody
        extends ChargingPileServerMessageBody {
    public ElectricityPricingStrategyUnit[] units;

    public ElectricityPricingStrategyUnit[] getUnits() {
        return units;
    }

    public void setUnits(ElectricityPricingStrategyUnit[] units) {
        this.units = units;
    }

    public void setUnits(ByteBuf byteBuf){
        if(units==null){
            units=new ElectricityPricingStrategyUnit[
                    MessageFieldConst.ELECTRICITY_PRICE_STRATEGY_UNIT_FILED_LENGTH];
        }
        for(int i=0;i<units.length;++i){
            units[i].encoder(byteBuf);
        }
    }

    @Override
    protected ElectricityPricingStrategyServerMessageBody encoder(ByteBuf bodyByteBuf) {
        setUnits(bodyByteBuf);
        return this;
    }

    @Override
    public int getLength() {
        return MessageFieldConst.ELECTRICITY_PRICE_STRATEGY_MESSAGE_BODY_LENGTH;
    }

    @Override
    public CommandEnum getCommand() {
        return CommandEnum.ELECTRICITY_PRICING_STRATEGY_SETTING_SERVER_CMD;
    }

    static class ElectricityPricingStrategyUnit{
        /**
         * 开始小时
         * 占1字节
         * 0~24
         */
        private short beginHour;
        /**
         * 开始分钟
         * 占1字节
         * 0或30
         */
        private short beginMinutes;
        /**
         * 结束小时
         * 占1字节
         * 0~24
         */
        private short endHour;
        /**
         * 结束分钟
         * 占1字节
         * 0或30
         */
        private short endMinutes;
        /**
         * 费率
         * 占4字节
         * 用整型值表示，要乘 0.01
         * 才能得到真实的值
         */
        private long rate;

        public short getBeginHour() {
            return beginHour;
        }

        public void setBeginHour(short beginHour) {
            this.beginHour = beginHour;
        }

        public short getBeginMinutes() {
            return beginMinutes;
        }

        public void setBeginMinutes(short beginMinutes) {
            this.beginMinutes = beginMinutes;
        }

        public short getEndHour() {
            return endHour;
        }

        public void setEndHour(short endHour) {
            this.endHour = endHour;
        }

        public short getEndMinutes() {
            return endMinutes;
        }

        public void setEndMinutes(short endMinutes) {
            this.endMinutes = endMinutes;
        }

        public long getRate() {
            return rate;
        }

        public void setRate(long rate) {
            this.rate = rate;
        }
        public ElectricityPricingStrategyUnit encoder(ByteBuf byteBuf){
            byteBuf.writeByte(getBeginHour());
            byteBuf.writeByte(getBeginMinutes());
            byteBuf.writeByte(getEndHour());
            byteBuf.writeByte(getEndMinutes());
            byteBuf.writeIntLE((int)getRate());
            return this;
        }
    }
}
