package Core_Java;

interface Movable{
    void move();
}
class Truck1 implements Movable {
    @Override
    public void move() {
        System.out.println("Truck is moving on ten wheel");
    }
}

class Bicycle implements Movable{
    @Override
    public void move() {
        System.out.println("Bicycle is moving on 2 wheels ");
    }
}

public class TestCase{
    public static void main(String[] args) {
        Truck1 t1 = new Truck1();
        t1.move();

        Bicycle b2 = new Bicycle();
        b2.move();
    }
}
