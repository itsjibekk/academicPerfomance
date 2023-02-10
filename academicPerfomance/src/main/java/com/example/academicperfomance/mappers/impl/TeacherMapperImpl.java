package com.example.academicperfomance.mappers.impl;

import com.example.academicperfomance.mappers.TeacherMapper;
import com.example.academicperfomance.models.Subject;
import com.example.academicperfomance.models.Teacher;
import com.example.academicperfomance.models.dto.SubjectDto;
import org.springframework.stereotype.Service;

@Service
public class TeacherMapperImpl implements TeacherMapper {
    @Override
    public Teacher toTeacher(SubjectDto subjectDto, Subject subject) {
        Teacher teacher = new Teacher();
        teacher.setSurname(subjectDto.getTeacher_name());
        teacher.setName(subjectDto.getTeacher_name());
        teacher.setPatronymic(subjectDto.getTeacher_name());

        if(subjectDto.isActive())  teacher.setActive(subjectDto.isActive());
        else teacher.setActive(false);
        teacher.setSubject(subject);
        return teacher;
    }
}
