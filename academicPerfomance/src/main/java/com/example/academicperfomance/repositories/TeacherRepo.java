package com.example.academicperfomance.repositories;

import com.example.academicperfomance.models.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface TeacherRepo extends JpaRepository<Teacher,Long> {
}
