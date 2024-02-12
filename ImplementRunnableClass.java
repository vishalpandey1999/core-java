package Threading;
import java.lang.*;

import static java.lang.Thread.sleep;

class multi implements Runnable{
    @Override
    public void run() {
        for(int i = 1; i <= 10; i++) {
            System.out.println("starting to running i :" + i);
            if (i % 2 == 0)
                try {
                    sleep(1000);
                } catch (Exception e) {
                }
            System.out.println("end thread....");
        }

    }
}

public class ImplementRunnableClass {
    public static void main(String[] args) {
        multi m1 = new multi();
        Thread t1 = new Thread(m1);
        t1.run();

    }
}
