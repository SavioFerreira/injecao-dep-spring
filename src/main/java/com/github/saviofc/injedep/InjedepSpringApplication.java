package com.github.saviofc.injedep;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class InjedepSpringApplication {

    public static void main(String[] args) {
        SpringApplication.run(InjedepSpringApplication.class, args);
    }

    @Bean
    ApplicationRunner runner(MigracaoUsuarioSpring migracaoUsuarioSpring) {
        return args -> {
            migracaoUsuarioSpring.migrar();
        };
    }
}
