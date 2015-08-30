package com.thoughtworks.tw101.intro.shapes;

/**
 * Created by Tito on 30/08/2015.
 */
public class VerticalLine extends Shape {

    public VerticalLine(int height) {
        StringBuilder lineBuilder = new StringBuilder();
        for (int i=0; i<height; i++) {
            lineBuilder.append("*\n");
        }
        shapeString = lineBuilder.toString();
    }

}
