import com.sample.threadclasses.ThreadExample;

import java.util.*;

public class Main {
    public static void main(String[] args) {


        Runnable r = ()->{
            System.out.println("Sample");
            for(int i=1;i<5;i++){System.out.println(i);}
        };
        Thread t = new Thread(r);
        t.start();
        System.out.println("Hello world!");
        for(int i=1;i<5;i++){System.out.println(i);}


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
        System.out.println(intList);

        //We can declare desc order Treeset by [passing comprator implementation
        //like below using lambda expression
       // TreeSet<Integer> tSet = new TreeSet<>((i1, i2) -> i2.compareTo(i1));

        //Runnable interface implementation using annonymous class and lambda Expression
        ThreadExample TE = new ThreadExample();
        TE.executeFromAnonymousCls();
        TE.fromLambdaExpr();

    }
}