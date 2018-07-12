package com.garxin.springcloud.component.euraka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 
 * @author Administrator
 *
 */
@EnableEurekaServer  //启动一个服务注册中心提供给其他应用进行对话
@SpringBootApplication
public class EurekaBootstrap {
    public static void main(String[] args) {
        SpringApplication.run(EurekaBootstrap.class, args);
    }
}
