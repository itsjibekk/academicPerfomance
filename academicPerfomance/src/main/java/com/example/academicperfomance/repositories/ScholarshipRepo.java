package com.example.academicperfomance.repositories;

import com.example.academicperfomance.models.Scholarship;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface ScholarshipRepo extends JpaRepository<Scholarship,Long> {
}
