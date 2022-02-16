package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student Tibo = new Student(
                    "tibo",
                    "tibolaperre@outlook.com",
                    LocalDate.of(2001, Month.SEPTEMBER,9)
            );

            Student Emma = new Student(
                    "emma",
                    "emmaDeleu@outlook.com",
                    LocalDate.of(2002, Month.OCTOBER,10)
            );

            repository.saveAll(List.of(Tibo, Emma));
        };
    }
}
