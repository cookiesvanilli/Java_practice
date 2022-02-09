package oop.oop;

public class Car extends Transport implements iLights {

    private boolean isOn;
    public Engine engine = new Engine();

    public Car(float speed, int weight, String color, byte[] coordinate) {
        super(speed, weight, color, coordinate);

        this.color = "sd";
    }

    public Car() {

    }

    @Override
    public void moveObject(float speed) {
        System.out.println("The object is moving at a speed of " + speed);
    }

    @Override
    public void setLight(boolean set) {
        this.isOn = set;
    }

    @Override
    public void blinkLight() {
        System.out.println("We blink our headlights");
    }
}
