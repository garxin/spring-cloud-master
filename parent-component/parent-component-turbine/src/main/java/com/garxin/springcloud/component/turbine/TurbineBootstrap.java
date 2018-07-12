package com.garxin.springcloud.component.turbine;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

/**
 * 
 * @author Administrator
 *
 */
@EnableHystrixDashboard
@EnableTurbine
@SpringBootApplication
public class TurbineBootstrap {
    public static void main(String[] args) {
        SpringApplication.run(TurbineBootstrap.class, args);
    }
}
