package top.hyg.controller;

import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import top.hyg.server.ICloudServer;

@RestController
public class CloudController {

    @DubboReference
    private ICloudServer cloudServer;

    @GetMapping("/test")
    public String cloudTest(@RequestParam("name") String name){
        return cloudServer.queryServerName(name);
    }
}
