import com.sample.beans.Employee;
import com.sample.exmpleclasses.*;
import com.sample.interfaces.StaticMethodInterface;

import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {


        Runnable r = ()->{
            System.out.println("Sample");
            for(int i=1;i<5;i++){System.out.println(i);}
        };
        Thread t = new Thread(r);
        //t.start();
        System.out.println("Hello world!");
        //for(int i=1;i<5;i++){System.out.println(i);}


        //Comparator(i)->public int compare(Object obj1,Object obj2) -- single abstract method so Comprator is functional interface
        //return -1 if obj1 come before obj 2
        //return 11 if obj1 come after obj 2
        //return 0 if obj1 == obj 2
        //Collections.sort(list); it will sort in default natural sorting oder.
        List<Integer> intList = Arrays.asList(90,10,20,9,3,40);
        Collections.sort(intList);
        System.out.println(intList);

        // Collections.sort(intList,(i1, i2) -> i2.compareTo(i1));
        //we can use Collections.sort() or list.sort method

        //Comparator<Integer> c = (i1, i2) -> i2.compareTo(i1);
        intList.sort((i1, i2) -> i2.compareTo(i1)); // or intList.sort(c);
        //Above can be replaced by ----  intList.sort(Comparator.reverseOrder());

        System.out.println(intList);

        //We can declare desc order Treeset by [passing comprator implementation
        //like below using lambda expression
       // TreeSet<Integer> tSet = new TreeSet<>((i1, i2) -> i2.compareTo(i1));

        //Runnable interface implementation using annonymous class and lambda Expression
        ThreadExample TE = new ThreadExample();
        TE.executeFromAnonymousCls();
        TE.fromLambdaExpr();

        //in lambda expression this refer to outer class object
        // but in inner class "this" refer to inner class object
        //eg.1)
        System.out.println("-------------------");
        VariableInnerClsAndLambda v = new VariableInnerClsAndLambda();
        v.m2();
        System.out.println("-------------------");

        System.out.println("----------default method concept start---------");
        //default method concept
        //we can declate concrete method insight interface using "default" keyword.
        //Child class can directly access that default method and also
        // if required child class can override that default method
        //We can declare n number of default methods insight interface
        DefaultMethodUseClass defaultMethodUseClass = new DefaultMethodUseClass();
         defaultMethodUseClass.accessDefaultMethod();
            System.out.println("----------default method concept end---------");
            //If multiple interface have same default method then child class need to override that method
            //otherwise wil get CE error due to enbiguity
        // eg. interface A{ default void m1(){----}}
        //interface B{ default void m1(){----}}
        //class Child implements A,B{
        //      public void m1(){ sop("Child implementation");
        //      A.super.m1(); if u want to use specific interface ,methd
        //      }
        //
        //      psvm(){
        //
        //      }
        // }


        System.out.println("----------static method insight interface concept start---------");

        StaticMethodInterface.staticMethod();
        System.out.println("----------static method insight interface concept end---------");

        System.out.println("\n----------Predicate interface concept start---------");
        PredicateClass predicateClass = new PredicateClass();
        predicateClass.executePredicate("Sagar");

        Predicate<String> p1 = (s) -> s.length()>5;
        Predicate<String> p2 = (s) -> s.contains("Z");
        String name = "Sagart";
        predicateClass.executePredicate((s) -> s.length()>5,name,"Length of given string is greater than 5 :");
        predicateClass.executePredicate(p1.negate(),name,"Length of given string is not greater than 5 :");
        predicateClass.executePredicate(p1.and(p2),name,"Length of given string is greater than 5 AND string contains Z :");
        predicateClass.executePredicate(p1.or(p2),name,"Length of given string is greater than 5 OR string contains Z :");

        Scanner s = new Scanner(System.in);
        System.out.println("Enter Character : ");
        char c = s.next().toLowerCase().charAt(0);
        System.out.println("-----checkStartsWith s or not ");
        String[] nameArr = {"Sagar","Jac","","Sukanya","Rohit","","Virat","Yuvraj",null};
        predicateClass.checkStringStartsWith(nameArr,c);

        //isEqual(Object obj) is static method present in Predicate
        Predicate<String> pr = Predicate.isEqual("SAGAR");
        System.out.println(pr.test("SAGAR"));

        System.out.println("----------Predicate interface concept End---------");

        System.out.println("----------Function interface concept Start---------");
        FunctionClass fc = new FunctionClass();
        fc.getStringLength("Sagar");

        Function<Integer,Integer> f = n -> n*n;
        fc.getResult(f,10);
        System.out.println("----------Function interface concept Start---------");


    }
}