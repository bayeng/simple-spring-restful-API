package com.learn_spring.spring_learn.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(
            StudentRepository studentRepository) {
        return  args -> {
            Student jay = new Student(
                    "Jay",
                    "j@j.com",
                    LocalDate.of(2000, 10, 10)

            );

            Student rose = new Student(
                    "Rose",
                    "R@j.com",
                    LocalDate.of(2000, 11, 10)

            );

            studentRepository.saveAll(
                    List.of(jay, rose));
        };
    }
}
