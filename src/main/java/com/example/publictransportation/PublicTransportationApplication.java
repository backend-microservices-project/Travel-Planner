package com.example.publictransportation;

import com.example.publictransportation.Repository.PTRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class PublicTransportationApplication {

    public static void main(String[] args) {
        SpringApplication.run(PublicTransportationApplication.class, args);
    }
    @Bean
    public CommandLineRunner runner(PTRepository ptRepository){return args -> {

    };
    }
}
