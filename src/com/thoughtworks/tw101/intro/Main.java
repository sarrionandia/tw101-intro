package com.thoughtworks.tw101.intro;

public class Main {

    public static void main(String[] args) {

        printAsterisk();
        System.out.println();
        printHorizontalLine(8);
        System.out.println();
        printVerticalLine(5);
        System.out.println();
        printRightAngleTriangle(6);

    }

    private static void printAsterisk() {
        System.out.println("*");
    }

    /**
     * Print a horizontal line of asterisks
     * @param length The length (in chars) of the line
     */
    private static void printHorizontalLine(int length) {
        for (int i=0; i<length; i++) {
            System.out.print('*');
        }
        System.out.println();
    }

    /**
     * Print a vertical line of asterisks
     * @param height The height (in console lines) of the line
     */
    private static void printVerticalLine(int height) {
        for (int i=0; i<height; i++) {
            System.out.println("*");
        }
    }


    /**
     * Print a right angled triangle
     * @param height The height of the triangle (in console lines)
     */
    private static void printRightAngleTriangle(int height) {
        for (int row=1; row<=height; row++) {
            for (int col=0; col<row; col++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }
}
