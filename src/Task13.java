import java.util.Random;

public class Task13 {
    public static void main(String[] args) {
        /*
        13.Napisz program który symuluje rzuty dwiema kastkami do gry
         (takie zwykłe białe kości jak w monopoly). Program ma wykonać 10 000 rzutów
          i wypisać liczbę która wypadała najczęściej (ta liczba jest oczywiście sumą
          oczek na dwóch kościach które symulujemy.

        * */

        Random random = new Random();
        int sumakostek = 0;
        int liczbaKtoraWypadalaNajczeesciej = 0;
        int[] tab = new int[10000];
        for (int i = 0; i < 10000; i++) {
            int kostka1 = random.nextInt(1, 7);
            int kostka2 = random.nextInt(1, 7);

            tab[i] = kostka1 + kostka2;
        }
        liczbaKtoraWypadalaNajczeesciej = sumakostek;


    }
}



