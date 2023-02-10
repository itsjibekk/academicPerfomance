package com.example.academicperfomance.services.impl;

import com.example.academicperfomance.mappers.ScholarshipMapper;
import com.example.academicperfomance.models.Scholarship;
import com.example.academicperfomance.repositories.ScholarshipRepo;
import com.example.academicperfomance.services.ScholarshipService;
import org.springframework.stereotype.Service;

@Service

public class ScholarshipServiceImpl implements ScholarshipService {

    private final ScholarshipRepo scholarshipRepo;
    private final ScholarshipMapper scholarshipMapper;

    public ScholarshipServiceImpl(ScholarshipRepo scholarshipRepo, ScholarshipMapper scholarshipMapper) {
        this.scholarshipRepo = scholarshipRepo;
        this.scholarshipMapper = scholarshipMapper;
    }


    @Override
    public Scholarship save(double size) {
        Scholarship scholarship = scholarshipMapper.scholarshipToDto(size);
        scholarshipRepo.save(scholarship);

        return scholarship;
    }
}
