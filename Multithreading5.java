package multithreading;

class MyThread1 extends Thread {
    @Override
    public void run() {
        int i = 0;
        while (i <= 20) {
            System.out.println("hello my name is vishal Pandey");
            i++;
        }
    }
}

class MyThread2 extends Thread {
    @Override
    public void run() {
        int i = 0;
        while (i <= 20) {
            System.out.println("Vishal you rock bro");
            i++;
        }
    }
}

public class Multithreading5 {
    public static void main(String[] args) {
        MyThread1 myth1 = new MyThread1();
        MyThread2 myth2 = new MyThread2(); // Create an instance of MyThread2

        myth2.setPriority(Thread.MAX_PRIORITY);
        myth1.start();
        myth2.start();
    }
}
