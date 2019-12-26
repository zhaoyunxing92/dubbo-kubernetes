/**
 * Copyright(C) 2019 Hangzhou zhaoyunxing Technology Co., Ltd. All rights reserved.
 */
package io.github.sunny.dubbo.service.impl;

import io.github.sunny.dubbo.ServerVersion;
import io.github.sunny.dubbo.kubernetes.service.InfoService;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.Service;
import org.apache.dubbo.rpc.RpcContext;

import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;
import java.util.Properties;

/**
 * @author zhaoyunxing
 * @date: 2019-12-24 23:11
 */
@Service(interfaceClass = InfoService.class)
@Slf4j
public class InfoServiceImpl implements InfoService {
    /**
     * 服务信息
     *
     * @return Properties
     */
    @Override
    public Properties serverInfo() {

        Properties properties = new Properties();
        try {
            InputStream in = getClass().getClassLoader().getResourceAsStream("git.properties");
            if (Objects.nonNull(in)) {
                properties.load(in);
            }
        } catch (IOException e) {
            log.error("git.properties文件不存在");
        }
        properties.setProperty("serverName", ServerVersion.getName());
        properties.getProperty("serverVersion", ServerVersion.getVersion());
        return properties;
    }

    @Override
    public String serverName() {
        return RpcContext.getContext().getUrl().getParameters().get("application");
    }

    /**
     * echo
     *
     * @param name 名称
     * @return 返回名称
     */
    @Override
    public String echo(String name) {
        return "hello:" + name;
    }
}
