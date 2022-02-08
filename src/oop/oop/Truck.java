package oop.oop;

public class Truck extends Transport {

    private boolean isLoaded;
    public Engine engine = new Engine();

    public Truck(int weight, byte[] coordinate) {
        super(weight, coordinate); //обращаемся к классу родителя
    }

    public Truck(int weight, byte[] coordinate, boolean isLoaded) {
        super(weight, coordinate);
        this.isLoaded = isLoaded;
    }

    //annotation
    @Override
    public void setValues(float speed, int weight, String color, byte[] coordinate) {
        super.setValues(speed, weight, color, coordinate);
        System.out.println("Second method");
    }

    @Override
    public void moveObject(float speed) {
        System.out.println("The object is moving at a speed of " + speed);

    }

    protected String getValues() {
        System.out.println(super.getValues());
        return getLoaded();
    }


    public void setLoaded(boolean loaded) {
        this.isLoaded = loaded;
    }

    public String getLoaded() {
        if (isLoaded) {
            return "The truck is loaded";
        } else {
            return "The truck is empty";
        }
    }
}
