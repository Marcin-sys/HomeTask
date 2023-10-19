public class Task5 {
    public static void main(String[] args) {
        int w = 5;

        for ( int i = w ; i >0; i--){
            for (int j = i; j >0 ; j--){
                System.out.print(" ");
            }
            for (int k = 2 * (w - i) + 1 ; k > 0; k--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
