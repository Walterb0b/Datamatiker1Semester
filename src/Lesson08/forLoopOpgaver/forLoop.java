package Lesson08.forLoopOpgaver;

public class forLoop {
    public static void main(String[] args) {
        mysteriousOne();
        mysteriousTwo();
        mysteriousThree();
    }

    public static void mysteriousOne(){
        for (int i = 3; i <= 15; i += 3){
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void mysteriousTwo(){
        for (int i = 20; i >= 4; i -= 4){
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void mysteriousThree(){
        int sum = 0;
        for(int i = 1; i <= 5; i++){
            sum += i;
            System.out.println("i: " + i + ", Sum: " + sum);
        }
    }
}
