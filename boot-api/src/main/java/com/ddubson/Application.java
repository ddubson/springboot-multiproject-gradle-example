package com.ddubson;

import com.ddubson.exceptions.BootCustomException;
import com.ddubson.logger.BootLogger;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@Configuration
public class Application implements CommandLineRunner {
    @Bean
    public BootLogger bootLogger() {
        return new BootLogger();
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        try {
            bootLogger().log("Boot logger from external module...");
        } catch (BootCustomException e) {
            System.out.println(e.getMessage());
        }
    }
}
