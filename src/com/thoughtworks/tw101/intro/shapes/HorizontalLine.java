package com.thoughtworks.tw101.intro.shapes;

/**
 * Created by Tito on 30/08/2015.
 */
public class HorizontalLine extends Line {

    public HorizontalLine(int length) {
        StringBuilder lineBuilder = new StringBuilder();

        for (int i=0; i<length; i++) {
            lineBuilder.append("*");
        }
        line = lineBuilder.toString();
    }

}
