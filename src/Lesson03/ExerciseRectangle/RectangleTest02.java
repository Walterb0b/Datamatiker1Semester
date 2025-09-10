package Lesson03.ExerciseRectangle;

public class RectangleTest02 {
    public static void main(String[] args){
        rectangleArea();
    }

    public static void rectangleArea(){
        Rectangle01 r1 = new Rectangle01(2,3);
        Rectangle01 r2 = new Rectangle01(10,15);

        double area1 = r1.calculateArea();
        double area2 = r2.calculateArea();

        System.out.println("Area of rectangle 1 is: " + area1);
        if (area1 > 10) {
            System.out.println("The rectangle is large" + "\n");
        }
        else {
            System.out.println("The rectangle is small" + "\n");
        }

        System.out.println("Area of rectangle 2 is: " + area2);
        if (area2 > 10) {
            System.out.println("The rectangle is large" + "\n");
        }
        else {
            System.out.println("The rectangle is small" + "\n");
        }
    }
}
