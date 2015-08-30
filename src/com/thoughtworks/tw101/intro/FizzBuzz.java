package com.thoughtworks.tw101.intro;

/**
 * Created by Tito on 30/08/2015.
 */
public class FizzBuzz {
    static void fizzBuzz(){
        for (int i=1; i<=100; i++){
            if ((i%3 == 0) && (i%5 == 0)) {
                System.out.println("FizzBuzz");

            } else if (i%3 == 0) {
                System.out.println("Fizz");

            } else if (i%5 == 0) {
                System.out.println("Buzz");

            } else {
                System.out.println(i);
            }
        }
    }
}
