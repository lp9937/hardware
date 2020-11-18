package com.hardware.server.service.property;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.net.InetAddress;
import java.util.List;
import java.util.Map;

@ConfigurationProperties(prefix = "hardware",
        ignoreUnknownFields = true)
@Component
public class HardwareProperties {
    /**
     * 服务节点
     */
    private String serviceNode;

    public String getServiceNode(){
        return serviceNode;
    }

    public void setServiceNode(String serviceNode) {
        this.serviceNode = serviceNode;
    }

    private HardwareProperties.Netty netty;

    public static class Netty{
        /**
         * 公共参数配置类
         */
        public static class Options{
            private Integer hardwareType;
            private String serviceId;
            private Integer port;
            private InetAddress address;

            private Integer soBackLog;

            public Integer getHardwareType(){
                return hardwareType;
            }

            public void setHardwareType(Integer hardwareType) {
                this.hardwareType = hardwareType;
            }

            public String getServiceId(){
                return serviceId;
            }

            public void setServiceId(String serviceId){
                this.serviceId=serviceId;
            }

            public Integer getPort() {
                return port;
            }

            public void setPort(Integer port) {
                this.port = port;
            }

            public InetAddress getAddress() {
                return address;
            }

            public void setAddress(InetAddress address) {
                this.address = address;
            }

            public Integer getSoBackLog(){
                return soBackLog;
            }

            public void setSoBackLog(Integer soBackLog) {
                this.soBackLog = soBackLog;
            }
        }

        /**
         * tcp参数配置
         */
        public static class Tcp{
            private Integer bossThreadNum;
            private Integer workerThreadNum;

            private Integer readerIdleTimeSeconds=60;
            private Integer writerIdleTimeSeconds=60;
            private Integer allIdleTimeSeconds=60;

            private Options options;

            public Integer getBossThreadNum() {
                return bossThreadNum;
            }

            public void setBossThreadNum(Integer bossThreadNum) {
                this.bossThreadNum = bossThreadNum;
            }

            public Integer getWorkerThreadNum() {
                return workerThreadNum;
            }

            public void setWorkerThreadNum(Integer workerThreadNum) {
                this.workerThreadNum = workerThreadNum;
            }

            public Options getOptions(){
                return options;
            }

            public void setOptions(Options options) {
                this.options = options;
            }

            public Integer getReaderIdleTimeSeconds() {
                return readerIdleTimeSeconds;
            }

            public void setReaderIdleTimeSeconds(Integer readerIdleTimeSeconds) {
                this.readerIdleTimeSeconds = readerIdleTimeSeconds;
            }

            public Integer getWriterIdleTimeSeconds() {
                return writerIdleTimeSeconds;
            }

            public void setWriterIdleTimeSeconds(Integer writerIdleTimeSeconds) {
                this.writerIdleTimeSeconds = writerIdleTimeSeconds;
            }

            public Integer getAllIdleTimeSeconds() {
                return allIdleTimeSeconds;
            }

            public void setAllIdleTimeSeconds(Integer allIdleTimeSeconds) {
                this.allIdleTimeSeconds = allIdleTimeSeconds;
            }
        }

        /**
         * udp参数配置
         */
        public static class Udp{
            private Integer workerThreadNum;
            private Options options;
            public Integer getWorkerThreadNum() {
                return workerThreadNum;
            }

            public void setWorkerThreadNum(Integer workerThreadNum) {
                this.workerThreadNum = workerThreadNum;
            }

            public Options getOptions(){
                return options;
            }

            public void setOptions(Options options) {
                this.options = options;
            }
        }

        private List<Tcp> tcpList;
        private List<Udp> udpList;

        public List<Tcp> getTcpList() {
            return tcpList;
        }

        public void setTcpList(List<Tcp> tcpList) {
            this.tcpList = tcpList;
        }

        public List<Udp> getUdpList() {
            return udpList;
        }

        public void setUdpList(List<Udp> udpList) {
            this.udpList = this.udpList;
        }
    }

    public Netty getNetty(){
        return netty;
    }

    public void setNetty(Netty netty){
        this.netty=netty;
    }
}
