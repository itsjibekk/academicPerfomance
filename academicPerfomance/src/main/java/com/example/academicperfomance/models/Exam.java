package com.example.academicperfomance.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIdentityReference;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.util.Date;

@Entity
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "exams")
public class Exam {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    Long id;
    @JsonFormat(pattern = "dd.MM.yyyy hh:mm")
    Date date;
    double duration;
    int score;
    @ManyToOne
    Subject subject;

}
