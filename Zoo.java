package Chat_gpt_OOPS_Question;
class Animal3{
    private String name;
    public Animal3(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void makeSound(){
        System.out.println("The " + name + " makes a generic sound.");
    }
}

class Lion extends Animal3{
    public Lion(String name){
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("The Lion roars loudly!");
    }
}

class Elephant extends Animal3{
    public Elephant(String name){
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("The Elephant trumpets with its trunk!");
    }
}

class Zoo_o{
    private Animal3[] animals;

    public Zoo_o(Animal3[] animals){
        this.animals = animals;
    }

    public void performAnimalSound(){
        for(Animal3 animal : animals){
            animal.makeSound();
        }
    }
}

public class Zoo {
    public static void main(String[] args) {
        Animal3[] zooAnimals = {
                new Lion("Mufasa"),
                new Elephant("Dumbo"),
                new Lion("Simba"),
                new Elephant("Babar")
        };

        Zoo_o zo = new Zoo_o(zooAnimals);
        zo.performAnimalSound();
    }
}
