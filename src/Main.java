import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        double[] random_array_1 = new double[10];
        for (int i = 0; i < 10; i++) {
            random_array_1[i] = Math.random() * 10;
        }

        Random random = new Random();
        double[] random_array_2 = new double[10];
        for (int i = 0; i < 10; i++) {
            random_array_2[i] = random.nextDouble() * 10;
        }

        System.out.println("Random array generated with Math.random()");
        System.out.println(Arrays.toString(random_array_1));
        System.out.println("Random array generated with class Random");
        System.out.println(Arrays.toString(random_array_2));

        Arrays.sort(random_array_1);
        Arrays.sort(random_array_2);
        System.out.println("Sorted random array generated with Math.random()");
        System.out.println(Arrays.toString(random_array_1));
        System.out.println("Sorted random array generated with class Random");
        System.out.println(Arrays.toString(random_array_2));
    }
}
