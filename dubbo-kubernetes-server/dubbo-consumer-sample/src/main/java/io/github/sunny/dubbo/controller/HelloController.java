/**
 * Copyright(C) 2019 Hangzhou zhaoyunxing Technology Co., Ltd. All rights reserved.
 */
package io.github.sunny.dubbo.controller;

import io.github.sunny.dubbo.kubernetes.service.InfoService;
import org.apache.dubbo.config.annotation.Reference;
import org.apache.dubbo.rpc.RpcContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Properties;

/**
 * @author zhaoyunxing
 * @date: 2019-12-24 23:25
 */
@RestController
@RequestMapping("/")
public class HelloController {

    @Reference
    private InfoService infoService;

    @GetMapping("/info")
    public Properties getInfo() {
        return infoService.serverInfo();
    }

    @GetMapping("/host")
    public String name() throws UnknownHostException {
        return InetAddress.getLocalHost().toString();
    }
}
