package com.garxin.springcloud.component.actuator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import de.codecentric.boot.admin.config.EnableAdminServer;

/**
 * 
 * @author Administrator
 *
 */
@SpringBootApplication
@EnableAdminServer
@EnableEurekaClient
public class ActuatorBootstrap {
    public static void main(String[] args) {
        SpringApplication.run(ActuatorBootstrap.class, args);
    }
}
