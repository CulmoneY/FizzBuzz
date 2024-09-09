/**
 * Solve the FizzBuzz challenge.
 */
class FizzBuzz {

    public static void main(String[] args) {

        int i = 1;
        while (i <=100) {
            i = doFizzBuzz(i);
        }
    }

    private static int doFizzBuzz(int i) {
        boolean div_by_3 = i % 3 == 0;
        boolean div_by_5 = i % 5 == 0;
        if (div_by_5 && div_by_3) {
            System.out.println("Fizz Buzz");
        } else if (div_by_5) {
            System.out.println("Buzz");
        } else if (div_by_3) {
            System.out.println("Fizz");
        } else {
            System.out.println(i);
        }
        i++;
        return i;
    }
}
