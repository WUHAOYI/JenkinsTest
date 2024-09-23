package com.why.jenkinstest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JenkinsTestApplication {

    public static void main(String[] args) {
        System.out.println("hello world1");
        SpringApplication.run(JenkinsTestApplication.class, args);
    }

}
