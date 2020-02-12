package com.springpractice.board;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BoardApplication {


    public static void main(String[] args) {
        System.setProperty("spring.devtools.restart.enabled","true");
        System.setProperty("spring.devtools.livereload.enabled","true");
        SpringApplication.run(BoardApplication.class, args
        );
    }

}
