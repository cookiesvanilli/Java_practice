package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("Переменные и типы данных\n---------");

        //byte - от -128 до 127 - занимает 1 байт
        //short - от -32768 до 32767 - занимает 2 байта
        //int - от -2147483648 до 2147483647 - занимает 4 байта
        //long - от -9 223 372 036 854 775 808 до 9 223 372 036 854 775 807 - занимает 8 байт

        int age;
        age = 25;

        age = 36;
        System.out.println("Возраст:" + age);

        age = 45;
        System.out.println("Возраст:" + age);

        byte numb1 = 127;
        short numb2 = 128;
        int numb3 = 56;
        long numb4 = 4567;
        System.out.println(numb1);

        float num1 = 4.63532f;
        double num2 = 5.7453532;
        System.out.println(num1);

        char ch = 't';

        String user_name = "Jamie";
        System.out.println(user_name);

        boolean isHappy = true;
        if (isHappy = true) {
            System.out.println(1);
        } else{
            System.out.println(0);
        }
    }
}
