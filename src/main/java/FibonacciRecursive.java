import java.util.Scanner;

/** Print the nth value of the fibonacci sequence using recursion
 *  (fn-1) + f(n-2)
 *  1 1 2 3 5 8 13
 */

public class FibonacciRecursive {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Which value from the fibonacci sequence do you wish to retrieve?");
        int n = input.nextInt();

        int fib = 0;
        
        for (int i = 1; i<=n; i++) {
            
            fib = fibonacci(i);
        }
        
        System.out.println(fib);
    }

    private static int fibonacci(int n) {

        if (n == 0) {

            return 0;
        } else if (n == 1 || n == 2) {

            return 1;
        }

        return fibonacci(n-1) + fibonacci(n-2);
    }
}
