package com.thoughtworks.tw101.intro.shapes;

/**
 * Created by Tito on 30/08/2015.
 */
public class RightAngleTriangle extends Shape {

    public RightAngleTriangle(int height) {

        StringBuilder builder = new StringBuilder();

        for (int row=1; row<=height; row++) {
            for (int col=0; col<row; col++) {
                builder.append("*");
            }
            builder.append("\n");
        }

        shapeString = builder.toString();
    }
}
