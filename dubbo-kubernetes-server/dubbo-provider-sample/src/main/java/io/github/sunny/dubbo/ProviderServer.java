/**
 * Copyright(C) 2019 Hangzhou zhaoyunxing Technology Co., Ltd. All rights reserved.
 */
package io.github.sunny.dubbo;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

/**
 * @author zhaoyunxing
 * @date: 2019-12-24 23:07
 */
@SpringBootApplication
public class ProviderServer {
    public static void main(String[] args) {
        new SpringApplicationBuilder(ProviderServer.class)
                .web(WebApplicationType.NONE)
                .run(args);
    }
}
