package com.sample.exmpleclasses;

import com.sample.beans.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionClass {


    public void getStringLength(String str){
        Function<String,Integer> f = s->s.length();// String::length; we can use methos referance
        System.out.println("Length of "+str+" : "+f.apply(str));
    }

    public void getResult(Function<Integer,Integer> f,Integer val){
        System.out.println(f.apply(val));
    }

    public void getDesignatedEmp(String designation,List<Employee> empLst,Predicate<Employee> checkPredicate){

        Function<List<Employee>,List<Employee>> filterToDesigEmp = (empList) -> {
            List<Employee> designatedEmp = new ArrayList<>();
            for(Employee e : empList){
                if(checkPredicate.test(e)){
                    designatedEmp.add(e);
                }
            }
            return designatedEmp;
        };
       // List<Employee> eee = filterToDesigEmp.apply(empLst);
        Function<List<Employee>,List<Employee>> increamentFilter = (empList) -> {
            for(Employee e : empList){
                e.setSalary(e.getSalary() +1000);
            }
            return empList;
        };

        //Use of endThen()
        System.out.println(filterToDesigEmp.andThen(increamentFilter).apply(empLst));
        increamentFilter = Function.identity();

    }
}
