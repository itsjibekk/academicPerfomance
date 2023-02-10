package com.example.academicperfomance.models.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.util.List;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class SubjectDto {
    @JsonProperty("name")
    String name;
    @JsonProperty("teacher_name")
    String teacher_name;
    @JsonProperty("exams")
    List<ExamDto> exams;
    boolean active;
}
