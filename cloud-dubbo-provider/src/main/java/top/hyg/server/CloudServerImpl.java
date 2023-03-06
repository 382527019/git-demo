package top.hyg.server;

import org.apache.dubbo.config.annotation.DubboService;

@DubboService
public class CloudServerImpl implements ICloudServer {

    @Override
    public String queryServerName(String name) {
        return "hello ,query server "+name+" by dubbo-cloud";
    }
}
