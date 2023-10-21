import java.util.Random;

public class Task9 {
    /*
    * 9.Napisz program który losuje dwie tablice (10 elementów, zakres 0 - 100).
    * Wynikiem działania programu mają być wypisane obie tablice,
    * oraz trzecia tablica w które każdy element jest sumą odpowiadających elementów
    *  z dwóch pierwszych tablic. Przykład:
1 4 4 64 45
23 32 5 23 3
24 36 9 87 48
    *
    * */
    public static void main(String[] args) {
        int[] tab = new int[5];
        int[] tab2 = new int[5];
        int[] sumTab = new int[5];
        Random random = new Random();
        int randomTab = 0;
        int randomTab2 = 0;
        for (int i = 0; i < 5; i++) {
            randomTab = random.nextInt(0, 100);
            randomTab2 = random.nextInt(0, 100);

            tab[i] = randomTab;
            tab2[i] = randomTab2;

            sumTab[i] = randomTab + randomTab2;
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
