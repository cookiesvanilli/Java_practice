package oop.oop;

public class Car extends Transport {

    public Engine engine = new Engine();

    public Car(float speed, int weight, String color, byte[] coordinate) {
        super(speed, weight, color, coordinate);

        this.color = "sd";
    }

    @Override
    public void moveObject(float speed) {
        System.out.println("The object is moving at a speed of " + speed);
    }
}
