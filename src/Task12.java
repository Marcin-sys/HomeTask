public class Task12 {
    public static void main(String[] args) {
        /*
        * 12.Napisz program który ma dwie zmienne:
weight - waga, liczba całkowita
height - wzrost, liczba całkowita
program ma obliczać BMI (wskaźnik masy ciała, wzór do znalezienia w internecie,
*  gdybyście nie znaleźli to piszcie) i na podstawie wyliczonego BMI wypisywać "Nadwaga, Niedowaga, W normie itp.

        * */
        int weight = 70;
        double height = 1.72;

        double BMI = weight / (height * height);
        System.out.println(BMI);

        if (BMI < 25){                  // 18.5 – 24.99 – wartość prawidłowa
            System.out.println("niedowaga");
        }else {
            System.out.println("nadwaga");
        }

    }
}
