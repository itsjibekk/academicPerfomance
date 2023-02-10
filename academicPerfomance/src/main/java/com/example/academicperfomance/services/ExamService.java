package com.example.academicperfomance.services;

import com.example.academicperfomance.models.Subject;
import com.example.academicperfomance.models.dto.ExamDto;

import java.util.List;

public interface ExamService {
    void save(Subject subject, List<ExamDto> exams);
}
