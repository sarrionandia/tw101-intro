package com.thoughtworks.tw101.intro;

public class Main {

    public static void main(String[] args) {

        printAsterisk();
        printHorizontalLine(8);
        printVerticalLine(5);

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


}
