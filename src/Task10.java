import java.util.Random;

public class Task10 {
/*
* 10.Napisac program w którym są 3 zmienne:
s - liczba całkowita - oznacza pierwszą liczbę ciągu arytmetycznego
k - liczba całkowita - oznacza krok w ciągu arytmetycznym
n - liczba całkowita - oznacza ilość elementów ciągu.
Program ma zwracać sumę elementów takiego ciągu. Przykład:
s = 3, k = 5, n = 4
program ma wygenerować 4 elementy (n), które wyglądają dla podanych s i k tak:
3, 8, 13, 18
następnie je sumuje i podaje wynik: 42.
Info o tym jak działa ciąg arytmetyczny jest na wikipedii :)

* */
    public static void main(String[] args) {
        Random random = new Random();
        int s = 5;
        int k = 7;
        int n = 10;

        int[] tab = new int[n];
        tab[0] = s;

        for ( int i = 1 ; i < n ; i++){
            tab[i] = s + (k * i);
        }
        int sumTab = 0;
        for (int element:tab){
            System.out.print(" " + element);
            sumTab = sumTab + element;
        }
        System.out.println();
        System.out.println("Sum: " + sumTab );
    }
}
