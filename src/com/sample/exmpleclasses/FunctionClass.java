package com.sample.exmpleclasses;

import java.util.function.Function;

public class FunctionClass {


    public void getStringLength(String str){
        Function<String,Integer> f = s->s.length();// String::length; we can use methos referance
        System.out.println("Length of "+str+" : "+f.apply(str));
    }

    public void getResult(Function<Integer,Integer> f,Integer val){
        System.out.println(f.apply(val));
    }
}
