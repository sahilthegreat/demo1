package com.example.demo1.controller;

import com.example.demo1.model.Student;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("api")
public class StudentController {

    @GetMapping("/students")
    public List<Student> getAllStudents() {
        Student student1 = new Student("Rohit", 21, "B.Tech", "CSE");
        Student student2 = new Student("Mohit", 28, "MBA", "Accounts");
        List<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        return students;
    }

}
