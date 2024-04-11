package com.sample.beans;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InitializeEmployees {

    
   public static List<Employee> getEmpList(){
       Employee e = new Employee("Sagar",1,"Solapur",90000L,"Developer");
       Employee e1 = new Employee("Sam",1,"Pune",70000L,"Developer");
       Employee e2 = new Employee("jam",1,"Kolhapur",910000L,"Tester");
       Employee e3 = new Employee("kam",1,"baramati",60000L,"Developer");
       Employee e4 = new Employee("sus",1,"dhule",110000L,"Manager");
       Employee e5 = new Employee("shubham",1,"barshi",80000L,"Lead");
       Employee e6 = new Employee("rohit",1,"tuljapur",50000L,"Developer");

       List<Employee> empList = Arrays.asList(e,e1,e2,e3,e4,e5,e6);
   return empList;
   }
}
