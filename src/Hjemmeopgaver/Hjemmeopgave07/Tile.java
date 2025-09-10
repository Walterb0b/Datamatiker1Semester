package Hjemmeopgaver.Hjemmeopgave07;

public class Tile {
    private char letter;
    private int value;


    //Default constructor
    Tile(){this('?', 0);}

    //Constructor with letter and value parameters
    Tile(char letter, int value){
        this.letter = letter;
        this.value = value;
    }
    //Getters
    public char getLetter() {return letter;}
    public int getValue() {return value;}

    //Setters
    public void setLetter() {this.letter = letter;}
    public void setValue() {this.value = value;}

    //printTile
    public String printTile(){
        return "The value of " + this.getLetter() + " is " + this.getValue();
    }

    @Override
    public String toString() {
        return letter + "{" + value + "}";
    }

    @Override
    public boolean equals (Object obj){
        Tile other;

        if ( !(obj instanceof Tile) ) {
            return false;
        }else{
            other = (Tile)obj;
        }

        return this.letter == other.letter;
    }
}
