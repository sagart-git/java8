package com.sample.beans;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data @AllArgsConstructor
public class Employee {
    private String name;
    private int empId;
    private String city;
    private double salary;
    private String designation;

}
