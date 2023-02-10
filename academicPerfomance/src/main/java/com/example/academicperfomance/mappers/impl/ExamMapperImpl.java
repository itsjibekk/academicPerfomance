package com.example.academicperfomance.mappers.impl;

import com.example.academicperfomance.mappers.ExamMapper;
import com.example.academicperfomance.models.Exam;
import com.example.academicperfomance.models.Subject;
import com.example.academicperfomance.models.dto.ExamDto;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ExamMapperImpl implements ExamMapper {
    @Override
    public List<Exam> toExam(Subject subject, List<ExamDto> examDto) {
        List<Exam> exams = examDto.stream().map(x-> toExamExamDtos(subject,x)).collect(Collectors.toList());
        return exams;
    }

    public Exam toExamExamDtos(Subject subject, ExamDto examDto) {
        Exam exam = new Exam();
        //дата сдачи больше текущей даты и это не выходные и время между 09:00 и 18:00
        try {
            String string1 = "09:00";
            Date time1 = new SimpleDateFormat("HH:mm").parse(string1);
            Calendar calendar1 = Calendar.getInstance();
            calendar1.setTime(time1);
            calendar1.add(Calendar.DATE, 1);

            String string2 = "18:00";
            Date time2 = new SimpleDateFormat("HH:mm").parse(string2);
            Calendar calendar2 = Calendar.getInstance();
            calendar2.setTime(time2);
            calendar2.add(Calendar.DATE, 1);

            Date x = examDto.getDate();
            if(examDto.getDate().after(new Date()) &&
                    ( (new java.sql.Date(examDto.getDate().getTime()).toLocalDate().toString()) != "Saturday")
                    &&
                    ((new java.sql.Date(examDto.getDate().getTime()).toLocalDate().toString()) != "Sunday")
                    &&   //checkes whether the current time is between 09:00 и 18:00
                    (x.after(calendar1.getTime()) && x.before(calendar2.getTime()))
            ) exam.setDate(examDto.getDate());

        } catch (ParseException e) {
            e.printStackTrace();
        }
        exam.setDuration(120);
        exam.setScore(examDto.getScore());
        exam.setSubject(subject);
        return exam;
    }
}
