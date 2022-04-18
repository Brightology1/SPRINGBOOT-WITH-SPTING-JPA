package com.example.springb.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class StudentService {
    public List<Student> getStudents() {
        return List.of(
                new Student(1L,
                        "Bright",
                        "brightology@gmail.com",
                        LocalDate.of(1990, Month.APRIL, 20),
                        32),
                new Student(2L,
                        "Ugochukwu",
                        "brightology2020@gmail.com",
                        LocalDate.of(1995, Month.APRIL, 20),
                        27),
                new Student(3L,
                        "Anokwuru",
                        "brightology3030@gmail.com",
                        LocalDate.of(1998, Month.APRIL, 21),
                        100),
                new Student(4L,
                        "Sampson",
                        "brightology1010@gmail.com",
                        LocalDate.of(2000, Month.APRIL, 25),
                        32)
        );
    }
}
