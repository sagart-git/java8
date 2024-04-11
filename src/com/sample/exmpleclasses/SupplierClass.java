package com.sample.exmpleclasses;

import java.util.function.Supplier;

public class SupplierClass {
    public void randomPasswordGen(){
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ@#$&";
        String generatedPass = "";
        Supplier<Integer> no = () -> (int) (Math.random() * 10);
        Supplier<String> charStr = () -> String.valueOf(characters.charAt((int)(Math.random()*31)));
        for(int i = 1;i<10;i++){
            if(i%2==0){
                generatedPass = generatedPass+no.get();
            }else{
                generatedPass = generatedPass+charStr.get();
            }
        }
        System.out.println("Generated password : "+generatedPass);
    }
}
