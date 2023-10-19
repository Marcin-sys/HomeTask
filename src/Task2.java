import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        int[] tab = new int[10];
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            int randomNumber = random.nextInt(6, 100);
            while (randomNumber % 7 != 0) {
                randomNumber = random.nextInt(6, 100);
            }
//            System.out.println("Adding number: " + randomNumber + " to list");
            tab[i] = randomNumber;
        }

        System.out.println("Printing all numbers inside a list");
        for (int element : tab) {
            System.out.println(element);
        }
    }
}
