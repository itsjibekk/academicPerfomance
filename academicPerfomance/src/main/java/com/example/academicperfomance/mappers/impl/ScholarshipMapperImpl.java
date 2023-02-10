package com.example.academicperfomance.mappers.impl;

import com.example.academicperfomance.mappers.ScholarshipMapper;
import com.example.academicperfomance.models.Scholarship;
import com.example.academicperfomance.utils.DateUtil;
import org.springframework.stereotype.Service;

import java.util.Date;
@Service
public class ScholarshipMapperImpl implements ScholarshipMapper {
    @Override
    public Scholarship scholarshipToDto(double size) {

        Scholarship scholarship = new Scholarship();
        scholarship.setSize(size);
        scholarship.setEnd_date(DateUtil.getInstance().getEndDate());
        scholarship.setStart_date(new Date());
        return scholarship;
    }
}
