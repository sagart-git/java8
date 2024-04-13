package com.sample.exmpleclasses;

public class MethodReference {

    private void m1(){
        for(int i=0;i<5;i++){
            System.out.println("From m1()  : "+i);
        }
    }

    public void methodRef(){
        //Method reference
        MethodReference methodReference = new MethodReference();
        Runnable r1 = methodReference :: m1;
        // here run() method of runnable interface internally refer to m1() method of MethodReference class
        Thread t1 = new Thread(r1);
        t1.start();
    }
}
