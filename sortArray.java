package com.stevenlian;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int totalIntegers = s.nextInt();
        int[] intArray = new int[totalIntegers];

        for (int i = 0; i < totalIntegers; i++) {
            intArray[i] = s.nextInt();

        }



        // sorting array
        sortArray(intArray, totalIntegers);


        if ( findQ1(intArray, totalIntegers)%1== 0) {
            System.out.println((int) (findQ1(intArray, totalIntegers)));

        } else {  System.out.println(findQ1(intArray, totalIntegers));

        }

        if (findQ1(intArray, totalIntegers)%1== 0) {
            System.out.println((int) findMedian(intArray, totalIntegers));

        } else {   System.out.println(findMedian(intArray, totalIntegers));

        }
        if (findQ1(intArray, totalIntegers)%1== 0) {
            System.out.println((int) findQ3(intArray, totalIntegers));

        } else {  System.out.println(findQ3(intArray, totalIntegers));

        }

    }

    public static int[] sortArray(int[] array, int n) {

        if (n < 0) {
            return array;
        }

        for (int i = 0; i < n - 1; i++) {
            if (array[i + 1] < array[i]) {
                int placeHolder = array[i + 1];
                array[i + 1] = array[i];
                array[i] = placeHolder;

            }
        }
        sortArray(array, n - 1);

        return array;
    }

    public static double findMedian(int[] array, int n) {
        if (n % 2 != 0) {
            return array[(n - 1) / 2];
        }
        return (double) (array[(n / 2) - 1] + array[n / 2]) / 2;
    }

    public static double findQ1(int[] array, int n) {
        if (n % 2 != 0) {
            if ((n + 1) % 4 == 0) {
                return array[((n + 1) / 4) - 1];
            }
            return (double ) (array[(n - 1) / 4] + array[((n - 1) / 4-1)]) / 2;

        }

        if (n % 4 != 0) {
            return array[(n - 2) / 4];
        }
        return (double) (array[(n) / 4] + ((array[(n) / 4]) - 1)) / 2;
    }

    public static double findQ3(int[] array, int n) {
        if (n % 2 != 0) {
            if ((n + 1) % 4 == 0) {
                return array[((n + 1) *3/ 4) - 1];
            }
            return (double) (array[((n - 1) *3/ 4)] + array[((n - 1) *3/ 4)+1]) / 2;

        }

        if (n % 4 != 0) {
            return array[((n - 2) * 3 / 4) + 1];
        }
        return (double) (array[(n * 3 / 4) - 1] + ((array[n * 3 / 4]))) / 2;

    }
}




