import java.util.Random;

public class Task13 {
    public static void main(String[] args) {
        /*
        13.Napisz program który symuluje rzuty dwiema kastkami do gry
         (takie zwykłe białe kości jak w monopoly). Program ma wykonać 10 000 rzutów
          i wypisać liczbę która wypadała najczęściej (ta liczba jest oczywiście sumą
          oczek na dwóch kościach które symulujemy.

        * */
        int number = 10000;
        Random random = new Random();
        int[] tab = new int[number];
        for (int i = 0; i < number; i++) {
            int kostka1 = random.nextInt(1, 7);
            int kostka2 = random.nextInt(1, 7);

            tab[i] = kostka1 + kostka2;
        }

        for (int element : tab){
            System.out.print(" " + element);
        }
        System.out.println();

        int count = 1 , tempCount;
        int popular = 1;
        int temp = 0;

        for ( int i =0; i < 13; i++){
            temp = i;
            tempCount = 0;
            for (int j = 1; j < tab.length; j++){
                if ( temp == tab[j]){
                    tempCount++;
                }
                if (tempCount > count){
                    popular = temp;
                    count = tempCount;
                }
            }
        }
        System.out.println("number " + popular);
    }
}



