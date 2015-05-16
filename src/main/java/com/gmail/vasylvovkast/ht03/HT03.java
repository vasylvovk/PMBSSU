package com.gmail.vasylvovkast.ht03;

import java.lang.reflect.Array;

/**
 * Created by vasyl on 5/16/15.
 */
public class HT03 {
    public static void main(String... args) {
        int[][] a = new int[][]{{1, 2, 3}, {4, 5, 6}};
        int[][] b = new int[a.length][a[0].length];
        for (int i = 0; i < a.length; i++) {
            for (int j = a[i].length, r = 0; j > 0; j--, r++) {
                b[i][r] = a[i][j - 1];
            }
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(
                        "a[" + i + "," + j + "] = " + a[i][j] +
                        "\tb[" + i + "," + j + "] = " + b[i][j] + ";\t"
                );
            }
            System.out.println();
        }
    }
}
