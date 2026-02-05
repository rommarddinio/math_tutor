package com.math_tutor.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int studentId;
    private String name;
    private String surname;
    @ManyToOne
    @JoinColumn(name = "courseId")
    private Course course;
    @OneToOne
    @JoinColumn(name = "userId")
    private User user;
}
