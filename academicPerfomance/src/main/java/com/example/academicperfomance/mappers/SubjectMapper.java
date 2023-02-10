package com.example.academicperfomance.mappers;

import com.example.academicperfomance.models.Subject;

public interface SubjectMapper {

    Subject toSubject(String name,boolean active);
}
