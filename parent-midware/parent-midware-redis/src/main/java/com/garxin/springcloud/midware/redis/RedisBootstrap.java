package com.garxin.springcloud.midware.redis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * 
 * @author Administrator
 *
 */
@SpringBootApplication
@EnableScheduling
@EnableCaching
public class RedisBootstrap {
    public static void main(String[] args) {
        SpringApplication.run(RedisBootstrap.class, args);
    }
}
