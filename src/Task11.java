public class Task11 {

    /*
    11.Napisz program który ma 3 zmienna a, b i c. Te zmienne to długości boków trójkąta.
Program ma sprawdzić czy z podanych boków da się zbudować trójkąt.
 Jeśli się da to program ma wypisać na ekranie true (w przeciwnym wypadku false)
 i obliczyć obwód tego trójkąta. Jak sprawdzić czy z podanych boków da się
  zbudować trójkąt znajdziecie w google pod hasłem: "Nierówność trójkąta".

    * */

    public static void main(String[] args) {
        int a = 2;
        int b = 2;
        int c = 5;

        if (a+b >= c){
            System.out.println("true");
            System.out.println("obwod rowna sie: " + (a+b+c));
        } else {
            System.out.println("false");
        }

    }
}
