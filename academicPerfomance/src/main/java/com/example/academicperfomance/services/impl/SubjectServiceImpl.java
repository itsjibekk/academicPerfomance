package com.example.academicperfomance.services.impl;

import com.example.academicperfomance.mappers.SubjectMapper;
import com.example.academicperfomance.models.Subject;
import com.example.academicperfomance.repositories.SubjectRepo;
import com.example.academicperfomance.services.SubjectService;
import org.springframework.stereotype.Service;

@Service

public class SubjectServiceImpl implements SubjectService {

    private final SubjectMapper subjectMapper;
    private final SubjectRepo subjectRepo;

    public SubjectServiceImpl(SubjectMapper subjectMapper, SubjectRepo subjectRepo) {
        this.subjectMapper = subjectMapper;
        this.subjectRepo = subjectRepo;
    }
    @Override
    public Subject save(String name,boolean active) {
        Subject subject = subjectMapper.toSubject(name,active);
        subjectRepo.save(subject);
        return subject;
    }
}
