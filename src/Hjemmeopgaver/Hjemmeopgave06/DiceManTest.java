package Hjemmeopgaver.Hjemmeopgave06;

public class DiceManTest {
    public static void main(String[] args) {
        theDayOfTheDiceMan();
    }
    static void theDayOfTheDiceMan(){
        System.out.println("The day of the DiceMan begins");
        System.out.println("------------------------------");
        DiceMan.doActivity();
        System.out.println("------------------------------");
        System.out.println("The day of the DiceMan is over");
    }
}
