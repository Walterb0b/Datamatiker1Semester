package Hjemmeopgaver.Hjemmeopgave04;
import java.util.Scanner;
public class DateTest {

    public static void main(String[] args) {
        createDate();
    }

    //Creating the date
    public static void createDate() {
        Date d1 = new Date(1, "September", 2025);
        printDate(d1);
    }

    //Printing the date
    public static void printDate(Date d) {
        //Get region
        Scanner scanner = new Scanner(System.in);

        System.out.print("Do you want the date in EU or US format?: ");
        String choice = scanner.nextLine();

        if(choice.equalsIgnoreCase("EU")){
            System.out.println(d.printEuropean());
        }
        else if (choice.equalsIgnoreCase("US")) {
            System.out.println(d.printAmerican());
        }
        else {
            System.out.println("Invalid region! Please run the program again :-)");
        }

        scanner.close();

    }
}


