import java.util.Random;
import static org.apache.commons.lang.math.RandomUtils.nextBoolean;
import static org.apache.commons.lang.math.RandomUtils.nextFloat;
import static org.apache.commons.lang.math.RandomUtils.nextInt;

public class RandomUtilsExample {

    public static void main(String args[]) {

        Random random = new Random();

        System.out.println("\nGenerating 10 random boolean: ");
        for (int i = 0; i < 10; i++){
            System.out.println("Random boolean: " + nextBoolean(random));
        }

        System.out.println("\nGenerating 10 random integer: ");
        for (int i = 0; i < 10; i++){
            System.out.println("Random int: " + nextInt(random,10));

        }

        System.out.println("\nGenerating 10 random float: ");
        for (int i = 0; i < 10; i++){
            System.out.println("Random float: " + nextFloat(random));
        }

    }
}
