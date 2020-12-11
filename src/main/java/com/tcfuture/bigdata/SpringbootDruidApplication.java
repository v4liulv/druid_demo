package com.tcfuture.bigdata;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author liulv
 * @since 1.0.0
 * <p>
 * 说明：
 */
@MapperScan("om.tcfuture.bigdata.dao")
@SpringBootApplication
public class SpringbootDruidApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootDruidApplication.class, args);
    }
}
