/**  Print 1-100, but multiples of 3 say "Fizz"
     multiples of 5 say "buzz"
     multiples of 3 and 5 say "FizzBuzz"*/

public class FizzBuzz {

    private final static String FIZZ = "Fizz";

    private final static String BUZZ = "Buzz";

    public static void main(String[] args) {

        for (int i = 1; i <= 100; i++) {

            if (i%3== 0 && i%5== 0) {

                System.out.println(FIZZ + BUZZ);
            } else if (i%3== 0) {

                System.out.println(FIZZ);

            } else if (i%5==0) {

                System.out.println(BUZZ);
            } else {

                System.out.println(i);
            }
        }
    }
}