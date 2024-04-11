package com.sample.exmpleclasses;

import com.sample.beans.Employee;
import com.sample.beans.InitializeEmployees;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerClass {
    public void executeConsumer(){
        //below consumer will print all employee detail
        Consumer<List<Employee>> consumer = (e) -> {
            for(Employee emp : e){
                System.out.println(emp);
            }
        };
        consumer.accept(InitializeEmployees.getEmpList());
    }
}
