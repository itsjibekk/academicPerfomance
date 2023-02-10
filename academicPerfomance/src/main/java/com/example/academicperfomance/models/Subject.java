package com.example.academicperfomance.models;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Entity
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "subjects")
public class Subject {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)

    Long id;
    String name;
    boolean isActive;



}
