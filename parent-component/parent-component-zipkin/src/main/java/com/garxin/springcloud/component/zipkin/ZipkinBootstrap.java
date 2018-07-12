package com.garxin.springcloud.component.zipkin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import zipkin.server.EnableZipkinServer;

/**
 * Created by ace on 2017/7/10.
 */
@SpringBootApplication
@EnableZipkinServer
public class ZipkinBootstrap {
    public static void main(String[] args) {
        SpringApplication.run(ZipkinBootstrap.class,args);
    }
}
