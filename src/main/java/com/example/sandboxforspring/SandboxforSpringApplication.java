package com.example.sandboxforspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SandboxforSpringApplication {

    public static void main(String[] args) {
        SpringApplication.run(SandboxforSpringApplication.class, args);
    }

    MultithreadingExperiment myExperiment = new MultithreadingExperiment();


    }


