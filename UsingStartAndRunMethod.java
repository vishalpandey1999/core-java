package Threading;

import java.lang.Thread;
class A1 extends Thread{
    public void run( ){
        for(int i = 1; i <= 5; i++){
            System.out.println("Thread is starting for running: "+i);
            try{
                sleep(1500);
            }catch(Exception e){ }
        }
        System.out.println("Thread is continue....");
    }
}

public class UsingStartAndRunMethod {
    public static void main(String[] args) {
        A1 obj = new A1();
        obj.start();
    }

}
