package com.sample.exmpleclasses;

public class ThreadExample {

    public void executeFromAnonymousCls(){
        Runnable r = new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<5;i++){
                    System.out.println("From anonymous class : "+i);
                }
            }
        };
        Thread t = new Thread(r);
        t.start();
    }

    public void fromLambdaExpr(){
        Runnable r = () -> {
            for(int i=0;i<5;i++){
                System.out.println("From lambda expression : "+i);
            }
        };
        Thread t = new Thread(r);
        //or
        //Thread t = new Thread(() -> {
         //   for(int i=0;i<5;i++){
           //     System.out.println("From lambda expression : "+i);
        //    }
        //});
        t.start();
    }


}
