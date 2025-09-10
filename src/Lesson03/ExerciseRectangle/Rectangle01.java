package Lesson03.ExerciseRectangle;

public class Rectangle01 {
    private double length;
    private double width;

    //Constructor
    public Rectangle01(double length, double width){
        this.length = length;
        this.width = width;
    }

    //Calculate perimeter
    public double calculatePerimeter(){
        return 2 * (length + width);
    }

    //Calculate area
    public double calculateArea(){
        return length * width;
    }

    //Get info
    public String getInfo(){
        return ("The length of the rectangle is: " + length + "\n" + "The width of the rectangle is: " + width);
    }

}
