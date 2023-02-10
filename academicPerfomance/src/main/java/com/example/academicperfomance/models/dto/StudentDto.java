package com.example.academicperfomance.models.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class StudentDto {
     Long studentId;
     @JsonProperty("name")
     String name;
     @JsonProperty("surname")

     String surname;
     @JsonProperty("patronymic")

     String patronymic;
     @JsonProperty("scholarship")

     double scholarship;
     @JsonProperty("subject")
     SubjectDto subject;
     boolean active;


}
