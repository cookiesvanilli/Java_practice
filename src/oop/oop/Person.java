package oop.oop;

public class Person {
    //Модификатор доступа static
    // принадлежит не к объекту, а к классу в целом
    //
    public static int count;

    public Person() {
        count++;
    }

    public static void getCount() {
        System.out.println("Amount: " + count);
    }
}
