package Hjemmeopgaver.Hjemmeopgave04;
public class Date {
    private int Date;
    private String month;
    private int year;


    //Constructor
    public Date(int Date, String month, int year){
        this.Date = Date;
        this.month = month;
        this.year = year;
    }

    //Returns the date in the american format
    public String printAmerican()
    {
        return ("In the american format" + " Today's date is: " + month + " " + Date + ", " + year);
    }

    //Returns the date in the european format
    public String printEuropean()
    {
        return ("In the european format" + " Today's date is: " + Date + " " + month + ", " + year);
    }


}
