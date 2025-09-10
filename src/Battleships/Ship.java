package Battleships;

public class Ship {
    private static int[] location;
    private static int numberOfHits;

    public Ship(int[] location){this.location = location;}

    public static void checkHit(){
        String result = "";
        for(int i = 0; i < location.length; i++){
            if(location[i] == GameHelper.userInput()) {
                numberOfHits++;
                result = "Hit!!!";
            } else {
                result = "Miss!!";
               if(numberOfHits == 3){
                   System.out.println("You have sunk the enemies ship!");
               }
            }
        }
        System.out.println(result);
    }

    public static boolean isSunk(){
         if(numberOfHits == 3) {
             return true;
         } else{
             return false;
         }
    }

}
