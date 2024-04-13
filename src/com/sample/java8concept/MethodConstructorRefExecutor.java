package com.sample.java8concept;

import com.sample.exmpleclasses.ConstructorReference;
import com.sample.exmpleclasses.MethodReference;

public class MethodConstructorRefExecutor {

    //In method & constructor reference method arguments are need to be same
    //return type doesn ot matter
    public static void execute(){
        MethodReference m = new MethodReference();
        m.methodRef();

        ConstructorReference cr = new ConstructorReference();
        cr.showStudent();
    }
}
