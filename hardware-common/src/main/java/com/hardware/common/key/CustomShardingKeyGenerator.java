package com.hardware.common.key;

import org.apache.shardingsphere.spi.keygen.ShardingKeyGenerator;
import org.springframework.stereotype.Component;

import java.util.Properties;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by lp on 2020/12/02
 * 自定义主键生成器
 */
@Component
public class CustomShardingKeyGenerator implements ShardingKeyGenerator {
    private final AtomicInteger key=new AtomicInteger(0);
    @Override
    public Comparable<?> generateKey() {
        return key.incrementAndGet();
    }

    @Override
    public String getType() {
        return "CUSTOM";
    }

    @Override
    public Properties getProperties() {
        return null;
    }

    @Override
    public void setProperties(Properties properties) {

    }
}
