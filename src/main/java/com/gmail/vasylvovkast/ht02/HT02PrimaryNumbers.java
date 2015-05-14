package com.gmail.vasylvovkast.ht02;

import java.util.ArrayList;

/**
 * Created by vasyl on 5/14/15.
 */
public class HT02PrimaryNumbers {
    public static void main(String... args) {
        int N = Integer.valueOf(args[0]);
        int tmp = 0,tmp1 = 0;
        ArrayList<Integer> primaryNum = new ArrayList();
        primaryNum.add(1);
        System.out.print(primaryNum.get(0) + "\t");
        for (int i = 2; i < N; i++) {
            boolean isPrim = true;
            for (int item: primaryNum)
                if ((i % item == 0) && (item !=1)) {
                    isPrim = false;
                }
            if (isPrim) {
                primaryNum.add(i);
                System.out.print(i + "\t");
                tmp++;
            }
            if (tmp == 10) {
                tmp1++;
                System.out.print("\t:" + tmp1*tmp + "\n");
                tmp = 0;
            }
        }
    }
}
