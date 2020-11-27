package com.hardware.server.service.charging.handler;

import com.hardware.common.annotation.MessageHandleRegister;
import com.hardware.common.enums.CommandEnum;
import com.hardware.server.service.charging.message.ChargingPileMessageHead;
import com.hardware.server.service.charging.message.body.request.HeartbeatRequestMessageBody;
import com.hardware.server.service.charging.message.body.response.HeartbeatResponseMessageBody;
import io.netty.util.CharsetUtil;
import org.springframework.stereotype.Component;

import java.util.concurrent.ConcurrentHashMap;

@Component
@MessageHandleRegister("CHARGING_PILE")
public class HeartbeatMessageHandler extends
        AbstractChargingPileMessageHandler<HeartbeatRequestMessageBody,HeartbeatResponseMessageBody> {
    private final ConcurrentHashMap<String,Integer> caches=new ConcurrentHashMap<>();

    @Override
    public CommandEnum getCommand() {
        return CommandEnum.HEARTBEAT_RESPONSE_CMD;
    }

    @Override
    public CommandEnum getReqCommand() {
        return CommandEnum.HEARTBEAT_CMD;
    }

    @Override
    protected ChargingPileMessageHead headHandle(ChargingPileMessageHead head){
        return head.setCommandType(CommandEnum.HEARTBEAT_RESPONSE_CMD.getCode());
    }

    @Override
    protected HeartbeatResponseMessageBody bodyHandle(HeartbeatRequestMessageBody body){
        byte[]code = body.getCode();
        String key=new String(code, CharsetUtil.US_ASCII);
        Integer ack=caches.compute(key,(k,v)->{
            if(v==null||v==Short.MAX_VALUE*2){
                v=1;
            }else{
                ++v;
            }
            return v;
        });

        HeartbeatResponseMessageBody responseBody=new HeartbeatResponseMessageBody();
        responseBody.setAck(ack);
        return responseBody;
    }
}
