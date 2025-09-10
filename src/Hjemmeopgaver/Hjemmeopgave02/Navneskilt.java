package Hjemmeopgaver.Hjemmeopgave02;

public class Navneskilt
{
    //Vi kalder vores strings i den rækkefølge vi gerne vil have dem
    public static void main(String[] args)
    {
        System.out.println(Stjerner());
        System.out.println(Navn());
        System.out.println(Email());
        System.out.println(Stjerner());
    }

    //Vi laver en string for stjernerne i toppen og bunden af navneskiltet
    public static String Stjerner()
    {
        //Vi bruger et for loop til at printe stjernerne
        int antalStjerner = 20;
        for (int i = 0; i < antalStjerner; i++)
            System.out.print("*");
        //Der skal være et return statement i vores string for at den vil printe
        return "";
    }

    //Vi laver en string med navn
    public static String Navn()
    {
        String Navn = "*\tOswald Carstensen\t*";
        return Navn;
    }

    //Vi laver en string med email
    public static String Email()
    {
        String Email = "*\tosca0001@stud.ek.dk\t*";
        return Email;
    }
}
