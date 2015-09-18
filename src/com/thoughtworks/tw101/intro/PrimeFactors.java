package com.thoughtworks.tw101.intro;

import java.util.LinkedList;
import java.util.List;

/**
 * Calculate prime factors
 * Created by Tito on 30/08/2015.
 */
public class PrimeFactors {

    public static List<Integer> primeFactors(int n) {
        LinkedList<Integer> factors = new LinkedList<>();

        for (int i=2; i<=n; i++) {
            // Check it is a factor
            while (n%i == 0) {
                factors.add(i);
                n = n / i;
            }
        }

        return factors;
    }
}
