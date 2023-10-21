import java.util.Random;

public class Task7 {
    /*
    * 7.Napisz program który generuje jednowymiarową tablicę (10 elementów) losowych liczb.
    * Program ma wygenerować druga tablicę która jest pierwszą tablicą w odwrotnej kolejności.
    * Wynikiem działania programu ma być wyświetlona pierwsza i druga tablica. Przykłady:
3, 23, 2, 23, 53
53, 23, 2, 23, 3
*
* 45, 23, 65, 1, 54
54, 1, 65, 23, 45
Zakres losowych liczb 0 - 100.
    * */
    public static void main(String[] args) {
        int [] tab = new int[10];
        Random random = new Random();

        for (int i = 0; i < 10; i++){
            tab[i] = random.nextInt(0,100);
        }

        for (int element: tab){
            System.out.print(" " + element);
        }
        System.out.println();
        int [] tab2 = new int[10];
        int countUp =0;
        for (int i = 9;i >= 0;i--){
            tab2[countUp] = tab[i];
            countUp = countUp +1;
        }
        for (int element : tab2){
            System.out.print(" " + element);
        }
    }
}
