import java.util.Scanner;

public class Pyramid {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("How many rows should the pyramid have?");
        int height = input.nextInt();

        if (height < 1) {

            System.out.println("Invalid height");
        } else {

            System.out.println(buildPyramid(height));
        }
    }

    private static String buildPyramid(int height) {

        String pyramid = "";
        for (int i = 1; i <= height; i++) {

            pyramid = pyramid.concat(addRow(i, height));
        }

        return pyramid;
    }

    private static String addRow(int rowNumber, int height) {

        String icon = "*";
        String space = " ";

        int nIcon = rowNumber * 2;
        int nSpace = ((height*2) - nIcon);

        return nSpace == 0 ? icon.repeat(nIcon) : space.repeat(nSpace/2)
                .concat(icon.repeat(nIcon))
                .concat(space.repeat(nSpace/2))
                .concat("\n");
    }
}
