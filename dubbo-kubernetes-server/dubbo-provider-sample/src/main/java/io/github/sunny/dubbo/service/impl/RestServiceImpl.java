/**
 * Copyright(C) 2020 Hangzhou zhaoyunxing Technology Co., Ltd. All rights reserved.
 */
package io.github.sunny.dubbo.service.impl;

import io.github.sunny.dubbo.kubernetes.service.RestService;
import org.apache.dubbo.config.annotation.Service;

/**
 * @author zhaoyunxing
 * @date: 2020-01-13 17:11
 */
@Service
public class RestServiceImpl implements RestService {
    /**
     * 动态日志级别
     *
     * @param pkg   包名称
     * @param level 日志级别
     */
    @Override
    public String dynamicLogging(String pkg, String level) {
        return "hello";
    }
}
