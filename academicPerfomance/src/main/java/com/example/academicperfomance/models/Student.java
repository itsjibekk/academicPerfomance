package com.example.academicperfomance.models;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Entity
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Student {

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    Long id;

    String name;
    String surname;
    String patronymic;
    boolean isActive;
    String address;

    @ManyToOne
    Scholarship scholarship;
    @ManyToOne
    Subject subject;
}
