package multithreading;

import static java.lang.Thread.MAX_PRIORITY;
import static java.lang.Thread.sleep;

class HelloWorld implements Runnable{
    @Override
    public void run() {
        int i = 0;
        while(i <= 20) {
            System.out.println(i+". Hello Java Programmer");
            i++;
        }
    }
}

class Java implements Runnable{
    @Override
    public void run() {
        int i = 0;
        while(i <= 20) {
            System.out.println(i+". Dear Vishal");
            i++;
        }
//        try{
//            sleep();
//        }catch (Exception e){
//            System.out.println(e);
//        }
    }
}

public class Multithreading3 {
    public static void main(String[] args) {
        HelloWorld hw = new HelloWorld();
        Thread t1 = new Thread(hw);

        Java j = new Java();
        Thread t2 = new Thread(j);

        t1.setPriority(MAX_PRIORITY);
        t1.getPriority();
        t1.start();
        t2.start();

    }
}
