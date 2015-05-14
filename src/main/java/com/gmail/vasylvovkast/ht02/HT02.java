package com.gmail.vasylvovkast.ht02;

/**
 * Created by vasyl on 5/14/15.
 */
public class HT02 {
    public static void main(String... args) {
        int step = 3;
        int start = 1000;
        int stop = 10000;
        int tmp = start;
        for (int i = start; i < stop; i += step) {
            System.out.print(i + "\t");
            if (((i - tmp) % 14 == 0) && (i - tmp >= 14)) {
                System.out.println();
                tmp = i + step;
            }
        }
    }
}
