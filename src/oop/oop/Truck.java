package oop.oop;

public class Truck extends Transport {

    private boolean isLoaded;

    public Truck(int weight, byte[] coordinate) {
        super(weight, coordinate); //обращаемся к классу родителя
    }

    public Truck(int weight, byte[] coordinate, boolean isLoaded) {
        super(weight, coordinate);
        this.isLoaded = isLoaded;
    }

    public void setLoaded(boolean loaded) {
        this.isLoaded = loaded;
    }

    public void getLoaded() {
        if (isLoaded) {
            System.out.println("The truck is loaded");
        } else {
            System.out.println("The truck is empty");
        }
    }
}
