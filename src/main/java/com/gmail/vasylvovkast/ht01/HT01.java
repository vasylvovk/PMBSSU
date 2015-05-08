package com.gmail.vasylvovkast.ht01;

/**
 * @author Vasyl Vovk
 * Завдання в якому потрібно вивести на екран всі непарні числа числа у
 * діапазоні [0..10].
 *
 */
public class HT01
{
    public static void main( String... args )
    {
        int N = 10;
        int odd = 1;
        while (odd <= N) {
            System.out.print(odd + "\t");
            odd+=2;
        }
        System.out.println();
    }
}
