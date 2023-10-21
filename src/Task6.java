import java.util.Random;

/*
6.Napisz program który generuje jednowymiarową tablicę (10 elementów) losowych liczb.
Wynikiem działania programu ma być wygenerowana tablica oraz ilość powtórzeń liczby 5.
Zakres losowych liczb 0 - 10.

* */
public class Task6 {
    public static void main(String[] args) {
        int [] tab = new int[10];
        Random random = new Random();

        for ( int i = 0; i < 10 ; i++){
            tab[i] = random.nextInt(0,10);
        }
        System.out.println("table have: ");
        int sumOfNumberCounts = 0;

        for (int element : tab ){
            System.out.print(" " + element);
            if (element == 5){
                sumOfNumberCounts = sumOfNumberCounts + 1;
            }
        }
        System.out.println();
        System.out.println("Sum count of number 5 is: " + sumOfNumberCounts);

    }

}
