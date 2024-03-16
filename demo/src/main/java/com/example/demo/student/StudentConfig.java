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
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student bala = new Student(
//                    41110163L,
                    "Balasubramani E",
                    20,
                    LocalDate.of(2004, Month.MARCH,14),
                    "balasubramani285@gmail.com"
            );
            Student arun = new Student(
//                    41110130L,
                    "Arun Deva",
                    20,
                    LocalDate.of(2003, Month.MAY,25),
                    "arundeva2404@gmail.com"
            );
            repository.saveAll(
                    List.of(bala,arun)
            );
        };
    }
}
