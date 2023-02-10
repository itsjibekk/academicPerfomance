package com.example.academicperfomance.models;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Entity
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "teachers")
public class Teacher {

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)

    Long id;
    String name;
    String surname;
    String patronymic;
    boolean isActive;
    @ManyToOne
    Subject subject;
}
