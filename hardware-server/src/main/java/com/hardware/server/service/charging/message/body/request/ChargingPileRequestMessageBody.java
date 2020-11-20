package com.hardware.server.service.charging.message.body.request;

import com.hardware.server.service.charging.constant.MessageFieldConst;
import com.hardware.server.service.charging.message.ChargingPileMessageBody;
import com.hardware.server.service.netty.message.NettyMessageBody;
import io.netty.buffer.ByteBuf;

public abstract class ChargingPileRequestMessageBody extends ChargingPileMessageBody {
    /**
     * 充电桩编码,ASSIC编码
     * 占32字节
     */
    private byte[] code;

    public byte[] getCode() {
        return code;
    }

    public ChargingPileRequestMessageBody setCode(byte[] code) {
        this.code = code;
        return this;
    }

    public ChargingPileRequestMessageBody setCode(ByteBuf byteBuf){
        if(code==null){
            code=new byte[MessageFieldConst.CODE_FIELD_LENGTH];
        }
        byteBuf.readBytes(code);
        return this;
    }

    public abstract NettyMessageBody decoder();
}
