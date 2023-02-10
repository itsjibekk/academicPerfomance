package com.example.academicperfomance.mappers;

import com.example.academicperfomance.models.Subject;
import com.example.academicperfomance.models.Teacher;
import com.example.academicperfomance.models.dto.SubjectDto;
import org.apache.catalina.mbeans.SparseUserDatabaseMBean;



public interface TeacherMapper {

    Teacher toTeacher(SubjectDto subjectDto, Subject subject);
}
