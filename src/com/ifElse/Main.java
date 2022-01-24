package com.ifElse;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("If_Else/Switch_Case\n---------");

       /* int a = 15, b = 10;
        if (a == b) {
            System.out.println("Ok");
        } else {
            System.out.println("not Ok");
        }*/

        Scanner scanner = new Scanner(System.in);
        /*
        System.out.print("Enter role: ");
        String role = scanner.nextLine();
        System.out.print("Enter password: ");
        String pass = scanner.nextLine();
        if (role.equals("Admin") && pass.equals("qwerty")) {
            System.out.println("Entrance is allowed");
        } else {
            System.out.println("No entry allowed");
        }*/


        /*int num = scanner.nextInt();
        switch (num) {
            case 1:
                System.out.println("Number is 1");
                break;
            case 2:
                System.out.println("Number is 2");
                break;
            default:
                System.out.println("Default");
        }*/

        //Calculator
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        int res;

        System.out.print("Arithmetic operation: ");
        String action = scanner.nextLine();
        action = scanner.nextLine();

        switch (action) {
            case "+":
                res = num1 + num2;
                System.out.println("Result: " + res);
                break;
            case "-":
                res = num1 - num2;
                System.out.println("Result: " + res);
                break;
            case "*":
                res = num1 * num2;
                System.out.println("Result: " + res);
                break;
            case "/":
                if (num2 == 0) {
                    System.out.println("Error");
                } else {
                    res = num1 / num2;
                    System.out.println("Result: " + res);
                }
                break;
            case "%":
                res = num1 % num2;
                System.out.println("Result: " + res);
                break;
            default:
                System.out.println("You entered something wrong");
        }
    }
}
