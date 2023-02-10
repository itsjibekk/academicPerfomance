package com.example.academicperfomance.mappers.impl;

import com.example.academicperfomance.mappers.SubjectMapper;
import com.example.academicperfomance.models.Subject;
import org.springframework.stereotype.Service;

@Service
public class SubjectMapperImpl implements SubjectMapper {
    @Override
    public Subject toSubject(String name, boolean active) {
        Subject subject = new Subject();
        subject.setActive(active);
        subject.setName(name);
        return subject;
    }
}
