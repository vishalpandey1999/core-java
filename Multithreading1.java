package multithreading;

class MyThr extends Thread{
    @Override
    public void run() {
        System.out.println("Hello, World!");
    }
}
public class Multithreading1 {
    public static void main(String[] args) {
        MyThr m1 = new MyThr();
        m1.start();
    }
}
