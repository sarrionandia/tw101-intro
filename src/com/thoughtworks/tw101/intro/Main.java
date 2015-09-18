package com.thoughtworks.tw101.intro;

import java.util.Arrays;
import com.thoughtworks.tw101.intro.shapes.*;

public class Main {

    public static void main(String[] args) {

        HorizontalLine singleChar = new HorizontalLine(1);
        System.out.println(singleChar);

        HorizontalLine hLine = new HorizontalLine(8);
        System.out.println(hLine);

        VerticalLine vLine = new VerticalLine(5);
        System.out.println(vLine);

        RightAngleTriangle rightAngleTriangle = new RightAngleTriangle(6);
        System.out.println(rightAngleTriangle);

        IsoscelesTriangle isoscelesTriangle = new IsoscelesTriangle(4);
        System.out.println(isoscelesTriangle);

        Diamond diamond = new Diamond(3);
        System.out.println(diamond);

        NameDiamond nameDiamond = new NameDiamond(4, "Roberto");
        System.out.println(nameDiamond);

        FizzBuzz.fizzBuzz();

        System.out.println(PrimeFactors.primeFactors(30));

    }
}
