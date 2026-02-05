package com.math_tutor.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Tutor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int tutorID;
    private String name;
    private String surname;
    private int age;
    private int teachingExperience;
    private String education;
    private String mail;
    private String phoneNumber;
    @OneToMany(mappedBy = "tutor")
    private Set<Course> courses = new HashSet<>();
    @OneToOne
    @JoinColumn(name = "userId")
    private User user;
}
