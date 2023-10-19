import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        int[][] tab2D = new int[5][5];
        Random random = new Random();
        int minimumNumber = 100;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                int randomNumber = random.nextInt(0, 100);
                tab2D[i][j] = randomNumber;
                if (randomNumber < minimumNumber) {
                    minimumNumber = randomNumber;
                }
                System.out.print(" " + randomNumber);
            }
            System.out.println();
        }
        System.out.println("Minimum number in Tab is: " + minimumNumber);
    }
}
