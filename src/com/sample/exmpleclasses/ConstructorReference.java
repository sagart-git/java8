package com.sample.exmpleclasses;

import com.sample.beans.Employee;
import com.sample.beans.Student;
import com.sample.interfaces.FunInterface;
import com.sample.interfaces.StudentFactoryFI;

public class ConstructorReference {

    public void showStudent(){
        //Explanation Student constructor and getStudent methos have same parameters so its
        // possible to pass the constructor reference.
        StudentFactoryFI studentFactoryFI = Student::new;
        Student student = studentFactoryFI.getStudent(1,"Sagar");
        //this method internally refer to Student parameterized constructor
        System.out.println(student);
    }

}
