import java.util.Random;

public class Task8 {
    public static void main(String[] args) {
        /*
        8.Napisz program który generuje dwie tablice (10 elementów) losowych liczb.
         Wynikiem działania programu mają być wyświetlone obie tablice oraz
          trzecia tablica będąca połączeniem dwóch wygenerowanych. Przykład:
3, 5, 12, 34, 45
45, 21, 65, 23, 1
3, 5, 12, 34, 45, 45, 21, 65, 23, 1
        * */

        int[] tab = new int[5];
        int[] tab2 = new int[5];
        int[] sumTab = new int[10];
        Random random = new Random();
        int randomTab = 0;
        int randomTab2 = 0;
        for (int i = 0; i < 5; i++) {
            randomTab = random.nextInt(0, 100);
            randomTab2 = random.nextInt(0, 100);

            tab[i] = randomTab;
            tab2[i] = randomTab2;

            sumTab[i] = randomTab;
            sumTab[i + 5] = randomTab2;
        }
        for (int elment : tab) {
            System.out.print(" "+elment);
        }
        System.out.println();
        for (int element : tab2) {
            System.out.print(" "+element);
        }
        System.out.println();

        for (int  element: sumTab){
            System.out.print(" "+element);
        }
    }
}
