package Threading;
import java.lang.Thread;
class A extends Thread{
    @Override
    public void run() {
        for(int i = 1; i <= 5; i++){
            if(i==1)
               Thread.yield();
            System.out.println("\n from Thread A : i ="+ i);
        }
        System.out.println("End of Thread A");
    }
}
class B extends Thread{
    public void run(){
        for(int j = 1; j <= 5; j++){
            if(j == 3)
                Thread.interrupted();
            System.out.println("\n from Thread B: j "+j);
        }
        System.out.println("End of thread B");
    }
}

class C extends Thread{
    public void run() {
        for (int k = 1; k <= 5; k++) {
            System.out.println("\n From Thread C : k = "+k);
            if (k == 1)
                try {
                    sleep(1000);
                } catch (Exception e) { }
        }
        System.out.println("End of Thread C");
 }
}

public class ThreadMethod {
    public static void main(String[] args) {
        A1 thread = new A1();
        B thread1 = new B();
        C thread2 = new C();
        System.out.println("Thread A is being started...");
        thread.start();
        System.out.println("Thread B is being started...");
        thread1.start();
        System.out.println("Thread C is being started...");
        thread2.start();
    }
}
