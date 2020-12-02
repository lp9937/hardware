package com.hardware.server.service.charging.message.body.client;

import com.hardware.common.enums.CommandEnum;
import io.netty.buffer.ByteBuf;

/**
 * Created by lp on 2020.12/01
 */
public class ElectricityPricingStrategyClientMessageBody
        extends ChargingPileClientMessageBody{
    /**
     * 结果
     * 占1字节
     * 0‐‐成功 1‐‐失败
     */
    private short result;

    public short getResult() {
        return result;
    }

    public void setResult(short result) {
        this.result = result;
    }

    @Override
    public ElectricityPricingStrategyClientMessageBody decoder() {
        ByteBuf body = getBody();
        setResult(body.readUnsignedByte());
        return this;
    }

    @Override
    public CommandEnum getCommand() {
        return CommandEnum.ELECTRICITY_PRICING_STRATEGY_SETTING_CMD;
    }
}
