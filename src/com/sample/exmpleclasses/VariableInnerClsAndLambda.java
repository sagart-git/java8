package com.sample.exmpleclasses;

import com.sample.interfaces.FunInterface;

public class VariableInnerClsAndLambda {

    int i = 10;
    public void m2(){
        System.out.println(" VariableInnerClsAndLambda : m1()");
        int j=9;
        FunInterface i = () -> {
            System.out.println("outer class variable : "+this.i);
            System.out.println("local variable of enclosing variable : "+j); // if we use local variable insight lambda expression then it will
            // become final we cant change its value if we change then will get CE
            //j=99;  -- CE java: local variables referenced from a lambda expression must be final or effectively final
        };
        i.m1();

    }

}
