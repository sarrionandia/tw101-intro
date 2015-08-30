package com.thoughtworks.tw101.intro.shapes;

import java.util.Arrays;

/**
 * Created by Tito on 30/08/2015.
 */
public class IsoscelesTriangle extends Shape {

    public IsoscelesTriangle(int height) {
        StringBuilder triangle = new StringBuilder();
        int baseWidth = triangleLineWidth(height);

        for (int row=1; row<=height; row++) {
            int lineWidth = triangleLineWidth(row);
            int paddingLength = (baseWidth - lineWidth) / 2;

            char[] charArray = new char[paddingLength];
            Arrays.fill(charArray, ' ');
            String padding = new String(charArray);

            //Add leading padding
            triangle.append(padding);

            //Add asterisks
            for(int i=0; i<lineWidth; i++) {
                triangle.append('*');
            }

            //Add trailing padding
            triangle.append(padding);
            triangle.append('\n');
        }
        shapeString = triangle.toString();

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
