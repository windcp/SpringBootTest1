package com.wind.play;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.wind.play.dao")
public class PlayApplication {

    public static void main(String[] args) {
        SpringApplication.run(PlayApplication.class, args);
    }
}
