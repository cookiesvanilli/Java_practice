package com.arrays;

import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
       /* int[] arr = new int[5];
        arr[0] = 41;
        arr[1] = 52;
        arr[2] = 73;
        arr[3] = 21;
        arr[4] = 43;
        int res = arr[2] + arr[3];
        System.out.println(res);

        float[] arr2 = new float[]{5.03f, 6.32f, 8.21f};
        System.out.println(arr2[1]);

        for (int i = 0; i < arr2.length; i++) {
            System.out.println("Elements: " + arr2[i]);
        }*/

       /* int[] arr = new int[4];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter number: ");
            int value = scanner.nextInt();
            arr[i] = value;
        }
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Minimal: " + min);*/

        //Многомерные массивы данных
        char[][] array = new char[2][2];
        array[0][0] = 't';
        System.out.println(array[0][0]);

        byte[][] nums = new byte[][]{
                {5, 3},
                {6, 2},
                {1, 7},
        };
        nums[1][1] = 53;
        System.out.println(nums[1][1]);
    }
}
