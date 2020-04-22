import java.util.Random;

public class DieFactory {
    private static int value = 0;
    private static int sides;
    private static Random random;

    public DieFactory() {

    }

    public void setSides(int sides) {
        this.sides = sides;
        this.random = new Random();
    }

    public int makeDie(int die) {
        int value=0;
        for (int i = 1; i < die; i++) {
            value = i;
            System.out.println(value);
        }
        return value;
    }
}




