package com.thoughtworks.tw101.intro.shapes;

/**
 * Created by Tito on 30/08/2015.
 */
public class NameDiamond extends Diamond {

    public NameDiamond(int height, String name) {
        super(height);

        String[] splitDiamond = shapeString.split("\n");
        splitDiamond[height-1] = name;

        shapeString = String.join("\n", splitDiamond);
    }
}
