package com.back;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class PtPrometheus251105Application {

    public static void main(String[] args) {
        SpringApplication.run(PtPrometheus251105Application.class, args);
    }

}
