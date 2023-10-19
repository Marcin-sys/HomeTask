import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        int[] tab = new int[10];
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            int randomNumber = random.nextInt(0, 20);
            if (i > 0) {
                while (randomNumber < tab[i - 1]) {
                    randomNumber = random.nextInt(0, 20);
                }
            }
            tab[i] = randomNumber;
        }
        for ( int element : tab){
            System.out.print(" "  + element);
        }
    }
}
