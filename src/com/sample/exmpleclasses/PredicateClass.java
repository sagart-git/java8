package com.sample.exmpleclasses;

import java.util.function.Predicate;

public class PredicateClass {

    public void executePredicate(String val){

        Predicate<String> p1 = (str) -> str.contains("S");
        Predicate<String> p2 = (str) -> str.contains("J");
//        /System.out.println(p.test(val));
        System.out.println(val +" not contains S :"+p1.negate().test(val));
        System.out.println(val +" contains S and J:"+p1.and(p2).test(val));
        System.out.println(val +" contains S or J:"+p1.or(p2).test(val));
        //negate() method of predicate
    }
    public void executePredicate(Predicate<String> p,String str, String msg){
        System.out.println(msg +" "+p.test(str));
    }
}
