package com.example.academicperfomance.repositories;

import com.example.academicperfomance.models.Subject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface SubjectRepo extends JpaRepository<Subject,Long> {
}
