package com.example.academicperfomance.mappers;

import com.example.academicperfomance.models.Student;
import com.example.academicperfomance.models.dto.StudentDto;

public interface StudentMapper {
    Student studentDtoToStudent(StudentDto studentDto);
}
