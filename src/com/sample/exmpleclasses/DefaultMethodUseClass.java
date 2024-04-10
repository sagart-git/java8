package com.sample.exmpleclasses;

import com.sample.interfaces.DefaultMethodInterface;

public class DefaultMethodUseClass implements DefaultMethodInterface {
    public void accessDefaultMethod(){
        DefaultMethodUseClass d = new DefaultMethodUseClass();
        d.defaultMethod();
        d.defaultMethod2();
    }

}
