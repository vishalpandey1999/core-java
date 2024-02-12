package multithreading;

import static java.lang.Thread.sleep;

class PrintNumber implements Runnable{
    @Override
    public void run() {
        for(int i = 1; i <= 10; i++){
            System.out.println("Thread 1 -> "+i);
        }
        try{
            sleep(100);
        }catch (Exception e){
            System.out.println(e);
        }
    }
}

class PrintNumber1 implements Runnable{
    @Override
    public void run() {
        for(int i = 11; i <= 20; i++){
            System.out.println("Thread 2 -> "+i);
        }
        try{
            sleep(150);
        }catch (Exception e){
            System.out.println(e);
        }

    }
}

public class Multithreading4 {
    public static void main(String[] args) {
        PrintNumber pn = new PrintNumber();
        Thread t1 = new Thread(pn);

        PrintNumber1 pn1 = new PrintNumber1();
        Thread t2 = new Thread(pn1);
        t1.start();
        t2.start();
    }
}
