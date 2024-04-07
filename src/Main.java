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
    }
}