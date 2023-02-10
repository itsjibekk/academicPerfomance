package com.example.academicperfomance.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.util.Date;

@Entity
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "scholarships")
public class Scholarship {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)

    Long id;
    double size;
    @JsonFormat(pattern = "dd.MM.yyyy hh:mm")
    Date start_date;
    @JsonFormat(pattern = "dd.MM.yyyy hh:mm")
    Date end_date;


}
