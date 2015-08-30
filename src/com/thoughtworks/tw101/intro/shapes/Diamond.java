package com.thoughtworks.tw101.intro.shapes;

/**
 * Created by Tito on 30/08/2015.
 */
public class Diamond extends Shape {

    public Diamond(int height) {

        StringBuilder diamond = new StringBuilder();

        String top = new IsoscelesTriangle(height).toString();
        diamond.append(top);

        StringBuilder reverse = new StringBuilder(top).reverse();
        //Remove the initial newline
        reverse.deleteCharAt(0);

        //Remove the duplicated center line
        String bottom = reverse.toString().substring(reverse.indexOf("\n")+1);

        diamond.append(bottom);

        shapeString = diamond.toString();
    }
}
