package com.example.academicperfomance.mappers.impl;

import com.example.academicperfomance.mappers.StudentMapper;
import com.example.academicperfomance.models.Student;
import com.example.academicperfomance.models.Subject;
import com.example.academicperfomance.models.dto.StudentDto;
import org.springframework.stereotype.Service;

@Service
public class StudentMapperImpl implements StudentMapper {
    @Override
    public Student studentDtoToStudent(StudentDto studentDto) {
        Student student = new Student();
        student.setName(studentDto.getName());
        student.setSurname(studentDto.getSurname());
        student.setActive(studentDto.isActive());
        student.setPatronymic(studentDto.getPatronymic());

        student.setAddress("Bishkek");


        return student;
    }
}
