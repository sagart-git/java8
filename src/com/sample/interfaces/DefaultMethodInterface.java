package com.sample.interfaces;

public interface DefaultMethodInterface {

    default void defaultMethod(){
        System.out.println("--  DefaultMethodInterface - insight defaultMethod()");
    }

    default void defaultMethod2(){
        System.out.println("--  DefaultMethodInterface - insight defaultMethod2()");
    }
}
