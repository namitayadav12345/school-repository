package com.example.school;

import org.springframework.web.bind.annotation.*;
import java.util.*;

import com.example.school.StudentService;
import com.example.school.Student;

@RestController
public class StudentController {

    StudentService schoolService = new StudentService();

    @GetMapping("/students")
    public ArrayList<Student> getStudents() {
        return schoolService.getStudents();
    }

    @GetMapping("/students/{studentId}")
    public Student getStudentById(@PathVariable("studentId") int studentId) {
        return schoolService.getStudentById(studentId);
    }

    @PostMapping("/students")
    public Student addStudent(@RequestBody Student school) {
        return schoolService.addStudent(school);
    }

    @PutMapping("/students/{studentId}")
    public Student updateStudent(@PathVariable("studentId") int studentId, @RequestBody Student school) {
        return schoolService.updateStudent(studentId, school);
    }

    @DeleteMapping("/students/{studentId}")
    public void deleteStudent(@PathVariable int studentId) {
        schoolService.deleteStudent(playerId);
    }

}