package com.sample.interfaces;

import com.sample.beans.Student;

public interface StudentFactoryFI {
    public Student getStudent(int rollNo, String name);
}
