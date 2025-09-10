package TheDiceMan;

public class DiceMan {
    //Get the number rolled on the dice and display activity
    private static int numberOfActivities = 6;

    public static int getNumberOfActivities(){
        return numberOfActivities;
    }

    public static void getActivity() {
        for(int i = 0; i < 5; i++) {
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
