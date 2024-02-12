package Core_Java;

import java.util.Random;

public class GuessTheNumberGame {
    private int guessTheNumber;

    public int getGuessTheNumber() {
        return guessTheNumber;
    }

    public void setGuessTheNumber(int guessTheNumber) {
        this.guessTheNumber = guessTheNumber;
    }

    Random random = new Random();
    int computerGenerate;
    public GuessTheNumberGame(int guessTheNumber){
        this.guessTheNumber = guessTheNumber;
        computerGenerate = random.nextInt(100);
    }



}
