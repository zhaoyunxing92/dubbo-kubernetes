/**
 * Copyright(C) 2019 Hangzhou zhaoyunxing Technology Co., Ltd. All rights reserved.
 */
package io.github.sunny.dubbo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author zhaoyunxing
 * @date: 2019-12-24 23:05
 */
@SpringBootApplication
public class ConsumerServer {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerServer.class, args);
    }
}
