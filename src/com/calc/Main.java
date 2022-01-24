package com.calc;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Data from the user. Mathematical actions\n---------");
        Scanner scan = new Scanner(System.in);

       /* System.out.print("Enter your name: ");
        String username = scan.nextLine(); //получение строки
        System.out.println("Hello, " + username);*/

        /*int numb1 = scan.nextInt(); //получение числа
        byte numb2 = scan.nextByte();*/

        /*int num1 = 50, num2 = 33;
        float res1 = num1 + num2;
        res1 += 10;
        System.out.println("Result: " + res1);

        float res2 = num1 - num2;
        res2--;
        System.out.println("Result: " + res2);

        float res3 = num1 * num2;
        System.out.println("Result: " + res3);

        float res4 = num1 / num2;
        System.out.println("Result: " + res4);

        float res5 = num1 % num2;
        System.out.println("Result: " + res5);*/

        System.out.print("Enter 1 number: ");
        float num1 = scan.nextFloat();

        System.out.print("Enter 2 number: ");
        float num2 = scan.nextFloat();

        float res1 = num1 + num2;
        float res2 = num1 - num2;
        float res3 = num1 * num2;
        float res4 = num1 / num2;

        System.out.println("Result: " + res1 + "\n" + res2 + "\n" + res3 + "\n" + res4);

    }
}
