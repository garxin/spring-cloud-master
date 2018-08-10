package com.garxin.springcloud.midware.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

// @ImportResource(locations={"classpath:application-mybatis.xml"})
@Configuration
@EnableAutoConfiguration
@EnableJpaRepositories(basePackages = { "com.garxin.*" }) // 用于扫描Dao @Repository
@ComponentScan(basePackages = { "com.garxin.*" }) // 用于扫描@Controller @Service
@EntityScan(basePackages = { "com.garxin.*" }) // 用于扫描JPA实体类 @Entity
@MapperScan(basePackages = { "com.garxin.springcloud.midware.user.dao" })
public class ConfigClass {

}