package com.hardware.server.service.charging.handler;

import com.hardware.common.annotation.MessageHandleRegister;
import com.hardware.common.enums.CommandEnum;
import com.hardware.server.service.charging.message.ChargingPileMessageHead;
import com.hardware.server.service.charging.message.body.client.HeartbeatClientMessageBody;
import com.hardware.server.service.charging.message.body.server.HeartbeatServerMessageBody;
import io.netty.util.CharsetUtil;
import org.springframework.stereotype.Component;

import java.util.concurrent.ConcurrentHashMap;

@Component
@MessageHandleRegister("CHARGING_PILE")
public class HeartbeatMessageHandler extends
        AbstractChargingPileMessageHandler<HeartbeatClientMessageBody, HeartbeatServerMessageBody> {
    private final ConcurrentHashMap<String,Integer> caches=new ConcurrentHashMap<>();

    @Override
    public CommandEnum getCommand() {
        return CommandEnum.HEARTBEAT_SERVER_CMD;
    }

    @Override
    public CommandEnum getReqCommand() {
        return CommandEnum.HEARTBEAT_CMD;
    }

    @Override
    protected ChargingPileMessageHead headHandle(ChargingPileMessageHead head){
        return head.setCommandType(CommandEnum.HEARTBEAT_SERVER_CMD.getCode());
    }

    @Override
    protected HeartbeatServerMessageBody bodyHandle(HeartbeatClientMessageBody body){
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

        HeartbeatServerMessageBody responseBody=new HeartbeatServerMessageBody();
        responseBody.setAck(ack);
        return responseBody;
    }
}
