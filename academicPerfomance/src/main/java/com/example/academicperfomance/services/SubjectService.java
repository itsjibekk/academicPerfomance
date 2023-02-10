package com.example.academicperfomance.services;

import com.example.academicperfomance.models.Subject;

public interface SubjectService {
    Subject save(String name,boolean active);
}
