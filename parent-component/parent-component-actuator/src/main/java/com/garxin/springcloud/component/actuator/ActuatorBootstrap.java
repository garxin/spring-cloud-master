package com.garxin.springcloud.component.actuator;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

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
