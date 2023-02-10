package com.example.academicperfomance.services.impl;

import com.example.academicperfomance.mappers.ExamMapper;
import com.example.academicperfomance.models.Exam;
import com.example.academicperfomance.models.Subject;
import com.example.academicperfomance.models.dto.ExamDto;
import com.example.academicperfomance.repositories.ExamRepo;
import com.example.academicperfomance.services.ExamService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExamServiceImpl implements ExamService {
    private final ExamMapper examMapper;
    private final ExamRepo examRepo;

    public ExamServiceImpl(ExamMapper examMapper, ExamRepo examRepo) {
        this.examMapper = examMapper;
        this.examRepo = examRepo;
    }

    @Override
    public void save(Subject subject, List<ExamDto> exams) {
         List<Exam> examss =  examMapper.toExam(subject,exams);
          examRepo.saveAll(examss);
    }
}
