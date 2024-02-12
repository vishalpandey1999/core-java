package multithreading;
class Priority extends Thread{
    @Override
    public void run() {
        System.out.println("inside the run() method");
    }
}
public class ThreadPriority {
    public static void main(String[] args) {
        Priority p1 = new Priority();
        Priority p2 = new Priority();
        Priority p3 = new Priority();

        System.out.println("Priority of the thread p1 is : " + p1.getPriority());
        System.out.println("Priority of the thread p2 is : " + p2.getPriority());
        System.out.println("Priority of the thread p3 is : " + p3.getPriority());

        p1.setPriority(6);
        p2.setPriority(3);
        p3.setPriority(9);

        System.out.println("Priority of the thread p1 is : " + p1.getPriority());
        System.out.println("Priority of the thread p2 is : " + p2.getPriority());
        System.out.println("Priority of the thread p3 is : " + p3.getPriority());
    }
}
