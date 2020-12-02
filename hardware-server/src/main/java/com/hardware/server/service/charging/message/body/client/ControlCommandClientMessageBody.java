package com.hardware.server.service.charging.message.body.client;

import com.hardware.common.annotation.MessageRegister;
import com.hardware.common.enums.CommandEnum;
import io.netty.buffer.ByteBuf;
import org.springframework.stereotype.Component;

/**
 * Created by lp on 2020/11/30
 * 充电装控制命令应答
 */
@Component
@MessageRegister
public class ControlCommandClientMessageBody
        extends ChargingPileClientMessageBody  {
    /**
     * 预留字段
     * 占2字节
     */
    private int reserve1;
    /**
     * 预留字段
     * 占2字节
     */
    private int reserve2;
    /**
     * 充电枪口
     * 占1字节
     */
    private short chargingGunPort;
    /**
     * 命令启始标志
     * 占4字节
     */
    private long cmdStartAddress;
    /**
     * 参数个数
     * 占1个字节
     */
    private short argumentCount;
    /**
     * 执行结果
     * 占1字节
     */
    private short executionResults;

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

    public long getCmdStartAddress() {
        return cmdStartAddress;
    }

    public void setCmdStartAddress(long cmdStartAddress) {
        this.cmdStartAddress = cmdStartAddress;
    }

    public short getArgumentCount() {
        return argumentCount;
    }

    public void setArgumentCount(short argumentCount) {
        this.argumentCount = argumentCount;
    }

    public short getExecutionResults() {
        return executionResults;
    }

    public void setExecutionResults(short executionResults) {
        this.executionResults = executionResults;
    }

    @Override
    public ControlCommandClientMessageBody decoder() {
        ByteBuf body=getBody();
        setReserve1(body.readUnsignedShortLE());
        setReserve2(body.readUnsignedShortLE());
        setBody(body);
        setChargingGunPort(body.readUnsignedByte());
        setCmdStartAddress(body.readUnsignedIntLE());
        setArgumentCount(body.readUnsignedByte());
        setExecutionResults(body.readUnsignedByte());
        return this;
    }

    @Override
    public CommandEnum getCommand() {
        return CommandEnum.CONTROL_COMMAND_CMD;
    }
}
