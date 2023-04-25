package com.example.randomapi.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

@Data
public class Person {
    private String name;
    private String address;
    private int age;
    private Date dateOfBirth;

    public Person(String name, String address, int age, Date dateOfBirth) {
        this.name = name;
        this.address = address;
        this.age = age;
        this.dateOfBirth = dateOfBirth;
    }
}
