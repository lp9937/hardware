package com.hardware.server.service.charging.message.body.client;

import com.hardware.common.annotation.MessageRegister;
import com.hardware.common.enums.CommandEnum;
import io.netty.buffer.ByteBuf;
import org.springframework.stereotype.Component;

@Component
@MessageRegister
public class StartChargingControlClientMessageBody
        extends ChargingPileClientMessageBody {
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
     * 命令执行结果
     * 占4字节
     */
    private long commandExecutionResults;

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

    public long getCommandExecutionResults() {
        return commandExecutionResults;
    }

    public void setCommandExecutionResults(long commandExecutionResults) {
        this.commandExecutionResults = commandExecutionResults;
    }

    @Override
    public StartChargingControlClientMessageBody decoder() {
        ByteBuf body=getBody();
        setReserve1(body.readUnsignedShortLE());
        setReserve2(body.readUnsignedShortLE());
        setCode(body);
        setChargingGunPort(body.readUnsignedByte());
        setCommandExecutionResults(body.readUnsignedIntLE());
        return this;
    }

    @Override
    public CommandEnum getCommand() {
        return CommandEnum.START_CHARGING_CONTROL_CMD;
    }
}
