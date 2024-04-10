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

    public void checkStringStartsWith(String[] arr, char c){
        Predicate<String> checkStartsWith = (s) -> s.charAt(0) == c;
        Predicate<String> checkIsBlankOrNull = (s) ->null == s || s.isEmpty();
        for(String s:arr){
            if(checkIsBlankOrNull.test(s)){
                System.out.println("Invalid value.");
            }else if(checkStartsWith.test(s.toLowerCase())  ){
                System.out.println(s+" Starts with "+c);
            }else{
                System.out.println(s+" not starts with "+c);
            }
        }
    }
}
