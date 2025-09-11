package Battleships;

public class Ship {
    private int[] location;
    private int numberOfHits;

    //Ship contructor
    public Ship(int[] location){
        this.location = location;
        this.numberOfHits = 0;
    }

    //Check the hit from the user
    public void checkHit(int userGuess){
        String result = "Miss!!";

        for(int i = 0; i < location.length; i++){
            if(location[i] == userGuess) {
                numberOfHits++;
                location[i] = - 1; //Mark as already hit
                result = "Hit!!!";
                break;
               }
            }
        System.out.println(result);

        if(isSunk()){
            System.out.println("You have sunk the enemy's ship!");
        }
    }

    //Check if ship is sunk
    public boolean isSunk(){
        return numberOfHits == location.length;
    }

}
