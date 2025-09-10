package Hjemmeopgaver.Hjemmeopgave07;

public class PrintTile {
    public static void main(String[] args) {
        Tile tile1 = new Tile('Z', 10);
        Tile tile2 = new Tile('B', 3);
        Tile tile3 = new Tile('Z', 10);

        //Printer tile med printTile og toString
        System.out.println(tile1.printTile());
        System.out.println(tile1);

        if(tile1.equals(tile2)){
            System.out.println("tile1 is equal to tile2");
        } else {
            System.out.println("tile1 is not equal to tile2");
        }

        if(tile1.equals(tile3)){
            System.out.println("tile1 is equal to tile3");
        } else {
            System.out.println("tile1 is not equal to tile3");
        }
    }
}
