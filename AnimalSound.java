package Chat_gpt_OOPS_Question;

abstract class Animal1 {
    public abstract void makeSound();
}

class Dog1 extends Animal1{
    @Override
    public void makeSound() {
        System.out.println("The dog barks");
    }
}

class Cat1 extends Animal1{
    @Override
    public void makeSound() {
        System.out.println("The cat Meows");
    }
}

public class AnimalSound{
    public static void main(String[] args) {
        Animal1 dog = new Dog1();
        Animal1 cat = new Cat1();

        dog.makeSound();
        cat.makeSound();

    }
}
