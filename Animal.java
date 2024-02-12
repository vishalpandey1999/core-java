package CodeWithHarryOOPS;

public class Animal {
    private String animalName;
    private int numberOfLag;
    private String colorOfAnimal;
    private String behaviorOfAnimal;

    public String getAnimalName() {
        return animalName;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public int getNumberOfLag() {
        return numberOfLag;
    }

    public void setNumberOfLag(int numberOfLag) {
        this.numberOfLag = numberOfLag;
    }

    public String getColorOfAnimal() {
        return colorOfAnimal;
    }

    public void setColorOfAnimal(String colorOfAnimal) {
        this.colorOfAnimal = colorOfAnimal;
    }

    public String getBehaviorOfAnimal() {
        return behaviorOfAnimal;
    }

    public void setBehaviorOfAnimal(String behaviorOfAnimal) {
        this.behaviorOfAnimal = behaviorOfAnimal;
    }

    public Animal() {
    }

    public Animal(String animalName, int numberOfLag, String colorOfAnimal, String behaviorOfAnimal) {
        this.animalName = animalName;
        this.colorOfAnimal = colorOfAnimal;
        this.numberOfLag = numberOfLag;
        this.behaviorOfAnimal = behaviorOfAnimal;
    }

    public void soundOfAnimal(){
        System.out.println("Animal Sound");
    }
}

