package Lesson03.ExerciseRectangle;

public class RectangleTest01 {

    public static void main(String[] args){
        CreateRectangle();
    }

    public static void CreateRectangle(){

        Rectangle01 r1 = new Rectangle01(5,3);
        PrintRectangle(r1);

        Rectangle01 r2 = new Rectangle01(10,15);
        PrintRectangle(r2);

    }

    public static void PrintRectangle(Rectangle01 r){
        System.out.println(r.getInfo());
        System.out.println("The area of the rectangle is: " + r.calculateArea());
        System.out.println("The perimeter of the rectangle is: "+ r.calculatePerimeter() + "\n");
    }

}
