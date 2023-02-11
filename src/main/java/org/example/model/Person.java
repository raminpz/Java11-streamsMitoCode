package org.example.model;

import lombok.AllArgsConstructor;

import lombok.NoArgsConstructor;

import java.time.LocalDate;


@AllArgsConstructor
@NoArgsConstructor
public class Person {

    private Integer id;

    private String name;

    private LocalDate birthDate;
}
