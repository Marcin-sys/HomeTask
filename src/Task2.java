import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        int[] tab = new int[10];
        Random random = new Random();

        for (int i = 0; i < tab.length; i++) {
            int randomNumber = random.nextInt(0, 100);
            while (randomNumber % 7 != 0) {
                randomNumber = random.nextInt(0, 100);
            }
            tab[i] = randomNumber;
        }
        System.out.println("Printing all numbers inside a list");
        for (int element : tab) {
            System.out.print(" " + element);
        }
    }
}
