package com.example.demo1.model;

import lombok.*;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class Student {
    String name;
    int rollNo;
    String course;
    String branch;
}
