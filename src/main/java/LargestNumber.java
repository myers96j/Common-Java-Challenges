/**
 *  Print the largest number in an array without using max
 */

public class LargestNumber {

    public static void main(String[] args) {

        int[] x = new int[]{1, 45, 6, 88, 20};

        System.out.println(findLargestNumber(x));
    }

    private static int findLargestNumber(int[] numbers) {

        int x = numbers[0];

        for (int number : numbers) {

            if (number > x) {

                x = number;
            }
        }

        return x;
    }
}
