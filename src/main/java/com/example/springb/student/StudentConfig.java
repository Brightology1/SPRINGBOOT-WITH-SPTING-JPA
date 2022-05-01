package com.example.springb.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student ugo = new Student(
                    "Bright",
                    "brightology3@gmail.com",
                    LocalDate.of(2000, Month.JANUARY, 1),
                    20
            );
            Student adaUgo = new Student(
                    "Ugochukwu",
                    "brightology4@gmail.com",
                    LocalDate.of(1998, Month.JANUARY, 1),
                    21
            );
            repository.saveAll(
                    List.of(ugo, adaUgo)
            );

        };

    }
}
