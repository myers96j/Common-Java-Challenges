import java.util.Scanner;

/** Print the nth value of the fibonacci sequence
 *  (fn-1) + f(n-2)
 *  1 1 2 3 5 8 13
 */

public class Fibonacci {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Which value from the fibonacci sequence do you wish to retrieve?");
        int n = input.nextInt();
        System.out.println(fibonacci(n));
    }

    private static int fibonacci(int n) {

        int f1 = 1;
        int f2 = 1;
        int f3 = 1;

        if (n == 0) {

            return 0;
        } else if (n == 1 || n == 2) {

            return f1;
        }

        for (int i = 3; i<=n; i++) {

            f3 = f1 + f2;
            f1 = f2;
            f2 = f3;
        }

        return f3;
    }
}
