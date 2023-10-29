import java.util.Arrays;
import java.util.Random;

public class Task14 {
    /*
    * 14.Napisz program który generuje tablicę liczb 0 i 1 (10 elementów).
    *  Program ma sprawdzić czy tablica jest symetryczna - pierwszy element
    * taki jak ostatni, drugi taki jak przedostatni itd. Wynikiem działania
    * programu ma być wypisana wygenerowana tablica oraz true albo false w
    * zależności czy jest symetria czy nie. (edited)
   ReactReply
    * */
    public static void main(String[] args) {
        int [] tab = new int[10];

        int[]tab2=new int[5];
        int[]tab3=new int[5];


        Random random = new Random();

        for (int i=0; i<10;i++){
            tab[i]= random.nextInt(0,2);
        }
        // tab. lenght - 1 - i
        for (int i=0; i<5;i++) {
            tab2[i]=tab[i];
        }
        for (int i=0; i<5;i++) {
            tab3[i] = tab[9-i];
        }

        for (int element : tab) {
            System.out.print(" " + element);
        }
        System.out.println();
        for (int element : tab2) {
            System.out.print(" " + element);
        }
        System.out.println();
        for (int element : tab3) {
            System.out.print(" " + element);
        }
        System.out.println();

        if (Arrays.equals(tab2, tab3)){
            System.out.println("true");
        }else {
            System.out.println("false");
        }
    }
}
