package Hjemmeopgaver.Hjemmeopgave03;

public class Tshirt
{
    String color;
    String print;
    String size;
    double price;

    void displayIt()
    {
        System.out.println("Cool " + color + " Tshirt for sale: "+ "size " + size  + " with a "+ print + " print" + " for " + "$"+price);
    }
}
