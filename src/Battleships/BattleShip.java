package Battleships;
import java.util.Arrays;
import java.util.Random;
public class BattleShip {
    public static void main(String[] args) {
        //While loop til at starte spillet
        //Placer skibet
        //Kald checkHit

        System.out.println("==Welcome Captain!==");
        System.out.println("The enemy ship is hiding in positions 0-6!");
        System.out.println("Sink it by hitting all 3 cells!");
        Random rand = new Random();
        int i = rand.nextInt(5);

        int[] loc = {i, i + 1, i + 2};
        Ship s = new Ship(loc);

        System.out.println(Arrays.toString(loc));

        battleshipGame();

    }

    public static void battleshipGame(){
        boolean finished = false;

        while(!finished){
            GameHelper.userInput();
            Ship.checkHit();

            if(!Ship.isSunk()){
                finished = false;
            }else{
                finished = true;
            }
        }

    }
}

