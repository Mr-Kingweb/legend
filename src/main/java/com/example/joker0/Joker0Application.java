package com.example.joker0;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * joker0应用程序
 *
 * @author JJ_un
 * @date 2023/08/03
 */
@SpringBootApplication
@MapperScan("com.example.joker0.generator.mapper")
public class Joker0Application {

    public static void main(String[] args) {
        SpringApplication.run(Joker0Application.class, args);
    }

}
