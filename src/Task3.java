import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        int[][] tab2D = new int[5][5];
        Random random = new Random();
        int bound = 101;
        int minimumNumber = bound;

        for (int i = 0; i < tab2D.length; i++) {
            for (int j = 0; j < tab2D[0].length; j++) {
                int randomNumber = random.nextInt(0, bound);
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
