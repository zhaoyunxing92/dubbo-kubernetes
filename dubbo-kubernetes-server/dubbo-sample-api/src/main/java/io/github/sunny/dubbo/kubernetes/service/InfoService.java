/**
 * Copyright(C) 2019 Hangzhou zhaoyunxing Technology Co., Ltd. All rights reserved.
 */
package io.github.sunny.dubbo.kubernetes.service;

import java.util.Properties;

/**
 * 服务信息
 *
 * @author zhaoyunxing
 * @date: 2019-12-24 15:23
 */
public interface InfoService {

    /**
     * 服务信息
     *
     * @return Properties
     */
    Properties serverInfo();

    /**
     * 返回服务名称
     *
     * @return
     */
    String serverName();

    /**
     * echo
     *
     * @param name 名称
     * @return 返回名称
     */
    String echo(String name);
}
