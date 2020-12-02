package com.hardware.server.service.charging.message.body.server;

import com.hardware.common.annotation.MessageRegister;
import com.hardware.common.enums.CommandEnum;
import com.hardware.server.service.charging.constant.MessageFieldConst;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import org.springframework.stereotype.Component;

//@Component
//@MessageRegister
public class StatusServerMessageBody extends
        ChargingPileServerMessageBody {
    /**
     * 占2字节
     */
    private int reserve1;
    /**
     * 占2字节
     */
    private int reserve2;

    /**
     * 充电口号
     * 占1字节
     */
    private short chargingPort;
    /**
     * 充电/预约卡号
     * 占32字节
     * ASSIC码，不够长度填’\0’
     */
    private byte[] cardNumber;
    /**
     * 余额(0.01)
     * 占4字节
     */
    private long balance;
    /**
     * 当前充电金额
     * 占4字节
     */
    private long currentChargingCharge;

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

    public short getChargingPort() {
        return chargingPort;
    }

    public void setChargingPort(short chargingPort) {
        this.chargingPort = chargingPort;
    }

    public byte[] getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(byte[] cardNumber) {
        this.cardNumber = cardNumber;
    }

    public void setCardNumber(ByteBuf byteBuf){
        if(cardNumber==null){
            cardNumber=new byte[MessageFieldConst.CARD_NUMBER_FIELD_LENGTH];
        }
        byteBuf.writeBytes(cardNumber);
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    public long getCurrentChargingCharge() {
        return currentChargingCharge;
    }

    public void setCurrentChargingCharge(long currentChargingCharge) {
        this.currentChargingCharge = currentChargingCharge;
    }

    @Override
    public ChargingPileServerMessageBody encoder(ByteBuf bodyByteBuf) {
        //ByteBuf bodyByteBuf= Unpooled.buffer(getLength());
        bodyByteBuf.writeShortLE(getReserve1());
        bodyByteBuf.writeShortLE(getReserve2());
        bodyByteBuf.writeByte(getChargingPort());
        bodyByteBuf.writeBytes(getCardNumber());
        bodyByteBuf.writeIntLE((int)getBalance());
        bodyByteBuf.writeIntLE((int)getCurrentChargingCharge());
        //setBody(bodyByteBuf);
        return this;
    }

    @Override
    public int getLength() {
        return MessageFieldConst.STATE_RESPONSE_MESSAGE_BODY_LENGTH;
    }

    @Override
    public CommandEnum getCommand() {
        return CommandEnum.STATE_SERVER_CMD;
    }
}
