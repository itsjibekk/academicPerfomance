package com.example.academicperfomance.mappers;

import com.example.academicperfomance.models.Exam;
import com.example.academicperfomance.models.Subject;
import com.example.academicperfomance.models.dto.ExamDto;

import java.util.List;

public interface ExamMapper {

    List<Exam> toExam(Subject subject, List<ExamDto> examDtos);
}
