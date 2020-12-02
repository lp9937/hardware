package com.hardware.server.service.charging.message.body.server;

import com.hardware.common.enums.CommandEnum;
import io.netty.buffer.ByteBuf;

/**
 * Created by lp on 2020/11/30
 */
public class ChargingRecordServerMessageBody
        extends ChargingPileServerMessageBody {
    /**
     * 保留字段
     * 占2字节
     */
    private int reserve1;
    /**
     * 保留字段
     * 占2字节
     */
    private int reserve2;
    /**
     * 充电口号
     * 占1字节
     */
    private short chargingGunPort;
    /**
     * 充电卡号
     * 占32字节
     */
    private byte[] cardNumber;

    public int getReserve1() {
        return reserve1;
    }

    public void setReserve1(int reserve1) {
        this.reserve1 = reserve1;
    }

    public int getReserve2() {
        return reserve2;
    }

    public void setReserve2(int reserve2) {
        this.reserve2 = reserve2;
    }

    public short getChargingGunPort() {
        return chargingGunPort;
    }

    public void setChargingGunPort(short chargingGunPort) {
        this.chargingGunPort = chargingGunPort;
    }

    public byte[] getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(byte[] cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    protected ChargingRecordServerMessageBody encoder(ByteBuf bodyByteBuf) {
        bodyByteBuf.writeShortLE(getReserve1());
        bodyByteBuf.writeShortLE(getReserve2());
        bodyByteBuf.writeByte(getChargingGunPort());
        bodyByteBuf.writeBytes(getCardNumber());
        return this;
    }

    @Override
    public int getLength() {
        return 0;
    }

    @Override
    public CommandEnum getCommand() {
        return CommandEnum.CHARGING_RECORD_SERVER_CMD;
    }
}
