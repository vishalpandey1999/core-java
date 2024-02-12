package Chat_gpt_OOPS_Question;

public class Animal {
    private String name;

    public Animal(String name){
        this.name = name;
        System.out.println("Animal constructor with name: "+this.name);
    }
}

class Dog extends Animal{
    private int age;
    public Dog(String name, int age){
        super(name);
        this.age = age;
        System.out.println("Dog constructor with age: "+this.age);
    }
}
class ConstructorChainingDemo{
    public static void main(String[] args) {
        Dog myDog = new Dog("Titu", 10);
    }
}
