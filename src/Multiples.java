public class Multiples {
    public static void main(String[] args) {
        int mult_3_or_5 = 0;
        for (int i = 1; i <= 999 ; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                mult_3_or_5 ++;
            }
        }
        System.out.println("The number of non-negative multiples of 3 or 5 below 1000 is: " + mult_3_or_5) ;
    }
}
