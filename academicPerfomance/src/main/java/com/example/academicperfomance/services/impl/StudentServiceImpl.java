package com.example.academicperfomance.services.impl;

import com.example.academicperfomance.mappers.StudentMapper;
import com.example.academicperfomance.models.Student;
import com.example.academicperfomance.models.dto.StudentDto;
import com.example.academicperfomance.repositories.StudentRepo;
import com.example.academicperfomance.services.*;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {

    private final StudentMapper studentMapper;
    private final StudentRepo studentRepo;
    private final ScholarshipService scholarshipService;
    private final ExamService examService;
    private final SubjectService subjectService;
    private final TeacherService teacherService;

    public StudentServiceImpl(StudentMapper studentMapper, StudentRepo studentRepo, ScholarshipService scholarshipService, ExamService examService, SubjectService subjectService, TeacherService teacherService) {
        this.studentMapper = studentMapper;
        this.studentRepo = studentRepo;
        this.scholarshipService = scholarshipService;
        this.examService = examService;
        this.subjectService = subjectService;
        this.teacherService = teacherService;
    }


    @Override
    public StudentDto save(StudentDto studentDto) {

        //student
        //scholarship
        //subject
        //teacher
        //exam

        Student student = studentMapper.studentDtoToStudent(studentDto);
        student =  studentRepo.save(student);

        //создаем стипендию
        student.setScholarship(scholarshipService.save(studentDto.getScholarship()));

        //создаем предмет
        student.setSubject(subjectService.save(studentDto.getSubject().getName(),studentDto.getSubject().isActive()));

        //создаем тичер
        teacherService.save(student.getSubject(), studentDto.getSubject());
        //создаем exam
        examService.save(student.getSubject(),studentDto.getSubject().getExams());

        studentDto.setActive(student.isActive());
        studentDto.setStudentId(student.getId());

        return studentDto;
    }
}
