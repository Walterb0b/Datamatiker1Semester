package Battleships;
import java.util.Random;
public class BattleShip {
    public static void main(String[] args) {
        //Welcome message
        System.out.println("==Welcome Captain!==");
        System.out.println("The enemy ship is hiding in positions 0-6!");
        System.out.println("Sink it by hitting all 3 cells!");
        System.out.println();

        //Generate random location for ship
        Random rand = new Random();
        int i = rand.nextInt(5);

        int[] location;
        location = new int[]{i, i + 1, i + 2};
        Ship enemyShip = new Ship(location);


        //Game loop
        while(!enemyShip.isSunk()){
            int userGuess = GameHelper.userInput();
            enemyShip.checkHit(userGuess);
        }

        GameHelper.close();
        System.out.println("Game over!");
    }
}

