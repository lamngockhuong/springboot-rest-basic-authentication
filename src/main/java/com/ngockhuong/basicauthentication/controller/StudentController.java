package com.ngockhuong.basicauthentication.controller;

import com.ngockhuong.basicauthentication.model.Student;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {
    @GetMapping("/students")
    public List<Student> getStudents() {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Lam Ngoc Khuong"));
        students.add(new Student(2, "Ngoc Khuong Lam"));
        return students;
    }
}
