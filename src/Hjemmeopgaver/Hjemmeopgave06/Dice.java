package Hjemmeopgaver.Hjemmeopgave06;

import java.util.Random;

public class Dice {
    //Attributes for the dice
    private final static int numberOfSides = 6;

    //Get number of sides
    static int getNumberOfSides() {
        return numberOfSides;
    }

    //Method to Roll the dice
    static int rollDice() {
        Random rand = new Random();
        return rand.nextInt(getNumberOfSides()) + 1;
    }
}
