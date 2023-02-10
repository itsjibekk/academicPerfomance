package com.example.academicperfomance.controllers;

import com.example.academicperfomance.models.dto.StudentDto;
import com.example.academicperfomance.services.StudentService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/studentw")
public class StudentController {

     private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping("/saves")
    public StudentDto save(@RequestBody StudentDto studentDto){

        return studentService.save(studentDto);
    }
    @GetMapping("/pl")
    public int geting(){
        return 2;
            }

}
