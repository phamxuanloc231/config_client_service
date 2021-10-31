package com.example.config_client_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ConfigClientServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfigClientServiceApplication.class, args);
    }

}
