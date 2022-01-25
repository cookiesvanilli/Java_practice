package com.collections;

import java.util.ArrayList;
import java.util.LinkedList;

public class Collections {
    public static void main(String[] args) {
        ArrayList<Byte> numbers = new ArrayList<>();
        numbers.add((byte) 5);
        numbers.add((byte) 50);
        numbers.add(1, (byte) 30);

        System.out.println("Size: " + numbers.size());
        System.out.println("Get: " + numbers.get(2));
        //numbers.remove(1);

        for (Byte i : numbers) {
            System.out.println(i);
        }
    }
}
