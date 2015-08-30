package com.thoughtworks.tw101.intro;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        printAsterisk();
        System.out.println();
        printHorizontalLine(8);
        System.out.println();
        printVerticalLine(5);
        System.out.println();
        printRightAngleTriangle(6);
        System.out.println();
        printIsoscelesTriangle(4);

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

    /**
     * Print a centered triangle with a given height
     * @param height The height of the triangle in console lines
     */
    private static void printIsoscelesTriangle(int height) {
        int baseWidth = triangleLineWidth(height);

        for (int row=1; row<=height; row++) {
            int lineWidth = triangleLineWidth(row);
            int paddingLength = (baseWidth - lineWidth) / 2;

            char[] charArray = new char[paddingLength];
            Arrays.fill(charArray, ' ');
            String padding = new String(charArray);

            //Print leading padding
            System.out.print(padding);

            //Print asterisks
            for(int i=0; i<lineWidth; i++) {
                System.out.print('*');
            }

            //Print trailing padding
            System.out.print(padding);
            System.out.println();
        }
    }

    /**
     * Calculate the length of a given line of the isosceles triangle
     * @param line The number of the line to be calculated
     * @return The length of the line
     */
    private static int triangleLineWidth(int line) {
        return 1 + ((line-1) * 2);
    }



}
