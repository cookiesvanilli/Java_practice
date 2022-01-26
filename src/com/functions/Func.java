package com.functions;

public class Func {
   /* public static void main(String[] args) {
        info("Hello");
        String j = "Java";
        info(j);
        info("");

        short num = 7;
        summ((short) 2, num);
    }

    public static void summ(short a, short b) {
        int res = a + b;
        System.out.println("Result: " + res);
    }

    //Method
    public static voidничего не возвращает info(String word) {
        System.out.println(word);
    }
    // без вызова вызывается только функция main*/

    /*public static void main(String[] args) {
        short num = 7;
        summa((short) 2, num);

        short num2 = 8;
        int result = sum((short) 3, num2);
        info(String.valueOf(result));
    }

    public static void summa(short a, short b) {
        int res = a + b;
        String result = "Result: " + res;
        info(result);
    }

    public static void info(String word) {
        System.out.println(word);
    }

    public static int sum(short a, short b) {
        int res = a + b;
        String result = "Result: " + res;
        info(result);
        return res;
    }*/

    public static void main(String[] args) {
        byte[] num1 = new byte[]{5, 4, 3};
        int sum1 = summaArr(num1);
        System.out.println("Summa 1: " + sum1);

        byte[] num2 = new byte[]{5, 4, 3, 5, 3, 6};
        int sum2 = summaArr(num2);
        System.out.println("Summa 2: " + sum2);
    }

    public static int summaArr(byte[] arr) {
        int summa = 0;
        for (byte i = 0; i < arr.length; i++) {
            summa += arr[i];
        }
        return summa;
    }
}
