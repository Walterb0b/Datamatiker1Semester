package Hjemmeopgaver.Hjemmeopgave03;

public class TshirtTest {
    public static void main(String[] args) {

        Tshirt T1 = new Tshirt();
        T1.color = "Black";
        T1.size = "L";
        T1.print = "Dinosaur";
        T1.price = 11.50;
        T1.displayIt();

        Tshirt T2 = new Tshirt();
        T2.color = "Blue";
        T2.size = "M";
        T2.print = "Rainbow";
        T2.price = 9.90;
        T2.displayIt();

        Tshirt T3 = new Tshirt();
        T3.color = "Yellow";
        T3.size = "S";
        T3.print = "Bicycle";
        T3.price = 15.00;
        T3.displayIt();
    }
}
