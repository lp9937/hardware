package com.hardware.server.service.netty.coder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.function.Predicate;

@Component
public class FrameCoderFactory {
    @Autowired
    private List<FrameDecoderParam> frameDecoderParams;
    @Autowired
    private List<FrameEncoderParam> frameEncoderParams;

    public FrameDecoderParam getFrameDecoderParam(
            Predicate<? super FrameDecoderParam> predicate){
        return frameDecoderParams.stream()
                .filter(predicate)
                .findFirst().get();
    }

    public FrameEncoderParam getFrameEncoderParam(
            Predicate<? super FrameEncoderParam> predicate){
        return frameEncoderParams.stream()
                .filter(predicate)
                .findFirst().get();
    }
}
