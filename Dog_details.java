package Core_Java;

class DOG {
    private String dog_name;
    private String breed;
    public DOG(String dog_name, String breed){
        this.dog_name = dog_name;
        this.breed = breed;
    }

    public String getDog_name() {
        return dog_name;
    }

    public void setDog_name(String dog_name) {
        this.dog_name = dog_name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
}
public class Dog_details{
    public static void main(String[] args) {
        DOG d1 = new DOG("jolly","Golden Retriever");
        DOG d2 = new DOG("Tiger","Bulldog");
        System.out.println(d1.getDog_name()+" is a "+ d1.getBreed()+".");
        System.out.println(d2.getDog_name()+" is a "+ d2.getBreed()+".");
        d1.setBreed("Labrador Retriever");
        d2.setDog_name("Buddy");
        System.out.println(d1.getDog_name() + " is now a " + d1.getBreed() + ".");
        System.out.println(d2.getDog_name() + " is now a " + d2.getBreed() + ".");

    }
}
