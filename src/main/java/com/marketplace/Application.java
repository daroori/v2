package com.marketplace;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EntityScan(basePackages = "com.marketplace.model")
@ComponentScan(basePackages = "com.marketplace")
@EnableJpaRepositories(basePackages = "com.marketplace.repository")
@AutoConfiguration
@SpringBootApplication(scanBasePackages = "com.marketplace")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
