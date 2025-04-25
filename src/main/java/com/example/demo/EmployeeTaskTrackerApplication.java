package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.example.demo.TaskRepository;

@SpringBootApplication(scanBasePackages = "com.example.ett")

public class EmployeeTaskTrackerApplication {
    public static void main(String[] args) {
        SpringApplication.run(EmployeeTaskTrackerApplication.class, args);
    }
}
