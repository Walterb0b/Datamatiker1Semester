package Hjemmeopgaver.Hjemmeopgave06;

public class DiceMan extends Dice{
    private final static int numberOfActivities = 5;

    static int getNumberOfActivities(){
        return numberOfActivities;
    }
    //Get the number rolled on the dice and display activity
    static void doActivity() {
        for(int i = 0; i < (getNumberOfActivities()); i++) {
            switch (Dice.rollDice()) {
                case 1 -> System.out.println("The DiceMan eats breakfast 🥐");
                case 2 -> System.out.println("The DiceMan studies something boring 🤓");
                case 3 -> System.out.println("The DiceMan goes swimming 🏊🏻");
                case 4 -> System.out.println("The DiceMan goes fishing 🎣");
                case 5 -> System.out.println("The DiceMan calls his mom ☎️");
                case 6 -> System.out.println("The DiceMan goes back to bed 🛌");
            }
        }
    }
}
