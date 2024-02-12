package multithreading;

class EvenNumber extends Thread{
    @Override
    public void run() {
        for(int i = 2; i <= 20; i += 2){
            System.out.println("Even Number is: "+i);
        }
        try{
            sleep(20);
        }catch (Exception e){
            System.out.println(e);
        }
    }
}

class OddNumber extends Thread{
    @Override
    public void run() {
        for(int i = 1; i <= 20; i += 2){
            System.out.println("Odd NUmber is: "+i);
        }
    }
}

public class MultipleThread2 {
    public static void main(String[] args) {
        EvenNumber en = new EvenNumber();
        OddNumber od = new OddNumber();
        en.start();
        od.start();
    }
}
