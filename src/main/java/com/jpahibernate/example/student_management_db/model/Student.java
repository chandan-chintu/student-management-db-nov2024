package com.jpahibernate.example.student_management_db.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity //it refers that it is a model or entity class which directly represents the database table
@Table(name = "student") //it will create a table inside database name student
public class Student {

    @Id //it is primary key and it cannot take duplicate values
    @Column(name = "student_id") // it will create a column in database with name student_id
    private int studentId;

    @Column(name = "name", nullable = false)// nullable = false - it is a mandatory field and cannot be null
    private String name;

    @Column(name = "email", nullable = false, unique = true)// unique = true - it will take unique values
    private String email;

    @Column(name = "grade", nullable = false)
    private String grade;

    @Column(name = "dob", nullable = false)
    private String dob;

    @Column(name = "password",nullable = false)
    private String password;

}
