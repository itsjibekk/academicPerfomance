package com.example.academicperfomance.services.impl;

import com.example.academicperfomance.mappers.TeacherMapper;
import com.example.academicperfomance.models.Subject;
import com.example.academicperfomance.models.Teacher;
import com.example.academicperfomance.models.dto.SubjectDto;
import com.example.academicperfomance.repositories.TeacherRepo;
import com.example.academicperfomance.services.TeacherService;
import org.springframework.stereotype.Service;

@Service

public class TeacherServiceImpl implements TeacherService {

    private final TeacherMapper teacherMapper;
    private final TeacherRepo teacherRepo;

    public TeacherServiceImpl(TeacherMapper teacherMapper, TeacherRepo teacherRepo) {
        this.teacherMapper = teacherMapper;
        this.teacherRepo = teacherRepo;
    }

    @Override
    public void save(Subject subject, SubjectDto subjectDto) {
        Teacher teacher = teacherMapper.toTeacher(subjectDto,subject);
        teacherRepo.save(teacher);
    }
}
