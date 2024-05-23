import java.util.Arrays;

/**
 *  Find the missing number in a sequence
 */

public class MissingNumber {

    public static void main(String[] args) {

        int[] x = new int[]{1, 2, 3, 4, 5, 7, 8};

        findMissingNumber(x);
    }

    private static void findMissingNumber(int[] numbers) {

        boolean found = false;
        int i = 1;

        while (!found && i < (int)Arrays.stream(numbers).count()) {

            if (i != numbers[i-1]) {

                found = true;
                System.out.println(i);
            }

            i++;
        }
    }
}
