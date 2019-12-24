/**
 * Copyright(C) 2019 Hangzhou zhaoyunxing Technology Co., Ltd. All rights reserved.
 */
package io.github.sunny.dubbo.service.impl;

import io.github.sunny.dubbo.ServerVersion;
import io.github.sunny.dubbo.kubernetes.service.InfoService;
import org.apache.dubbo.config.annotation.Service;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * @author zhaoyunxing
 * @date: 2019-12-24 23:11
 */
@Service(interfaceClass = InfoService.class)
public class InfoServiceImpl implements InfoService {
    /**
     * 服务信息
     *
     * @return Properties
     */
    @Override
    public Properties serverInfo() {

        Properties properties = new Properties();
        InputStream in = getClass().getClassLoader().getResourceAsStream("git.properties");
        try {
            properties.load(in);
        } catch (IOException e) {
            e.printStackTrace();
        }
        properties.setProperty("serverName", ServerVersion.getName());
        properties.getProperty("serverVersion", ServerVersion.getVersion());
        return properties;
    }
}
