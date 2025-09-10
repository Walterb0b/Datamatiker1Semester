import java.util.Random;
public class Ship {
    private int[] location;

    public Ship(int[] location){this.location = location;}

    static Random rand = new Random();
    Ship ship = new Ship(new int[]{0, 0, 0});

    public int[] setLocation(int[] location) {
        int i = rand.nextInt(0, 3);
        this.location = new int[]{i, i + 1, i +2 };
        return this.location;
    }

    ship.setLocation();

}
