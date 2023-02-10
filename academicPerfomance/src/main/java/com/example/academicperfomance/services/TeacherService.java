package com.example.academicperfomance.services;

import com.example.academicperfomance.models.Subject;
import com.example.academicperfomance.models.dto.SubjectDto;

public interface TeacherService {
    void save(Subject subject, SubjectDto subjectDto);
}
