package Lesson11.ArrayList.Vandpolo;

import java.util.ArrayList;
import java.util.Scanner;

public class VandpoloArrayListScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Hvor mange spillere vil du have på dit hold: ");
        int antalSpillere = scanner.nextInt();

        ArrayList<Spiller> hold = new ArrayList<>();

        for(int i = 0; i < antalSpillere; i++){
            System.out.print("Indtast navn på spiller " + (i + 1) + ": ");
            String navn = scanner.nextLine();
            scanner.next();
            Spiller a = new Spiller(navn);
            hold.add(a);
        }

        for(Spiller s : hold){
            System.out.println(s);
        }
    }
}
