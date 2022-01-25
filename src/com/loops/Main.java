package com.loops;

public class Main {
    public static void main(String[] args) {
        System.out.println("For_While_DoWhile\n---------");
        /*for(float i = 100; i > 10; i/=2) {
            System.out.println("Element: " + i);
        }*/
        /*int i = 200;
        while (i > 5) {
            System.out.println("Element: " + i);
            i -= 25;
        }*/
       /* int i = 0;
        do {
            System.out.println("Element: " + i);
            i++;
        } while (i < 10);*/

        for (int i = 5; i < 25; i += 2) {
            if (i % 3 == 0) {
                continue;
            }
            if (i >= 17) {
                break;
            }
            System.out.println("Element: " + i);
        }
    }
}
