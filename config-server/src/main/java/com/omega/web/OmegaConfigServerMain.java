package com.omega.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.ConfigServerApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class OmegaConfigServerMain {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        SpringApplication.run(ConfigServerApplication.class, args);
    }
}