package oop.oop;

public abstract class Transport {
    //Модификаторы доступа
    //public - доступны отовсюду
    //protected - поле, класс, метод доступен внутри самого класса и внутри классов наследников
    //private - закрытый, виден в пределах класса

    private float speed;
    private int weight;
    protected String color;
    private byte[] coordinate;


    public Transport(float speed, int weight, String color, byte[] coordinate) {
        //example Join to DB
        System.out.println("Object created");
        setValues(speed, weight, color, coordinate);
        //System.out.println(this.getValues());
    }

    public Transport(int weight, byte[] coordinate) {
        this.weight = weight;
        this.coordinate = coordinate;
        //System.out.println(this.getValues());
    }

    public abstract void moveObject(float speed);

    protected void setValues(float speed, int weight, String color, byte[] coordinate) {
        this.speed = speed;
        this.weight = weight;
        this.color = color;
        this.coordinate = coordinate;
    }

    protected String getValues() {
        String info = "Object speed: " + this.speed + ". Weight: " + this.weight + ". Color: " + this.color;
        String infoCoord = ". \nCoordinates:\n";
        for (int i = 0; i < coordinate.length; i++) {
            infoCoord += coordinate[i] + "\n";
        }
        return info + infoCoord;
    }

    class Engine {
        private boolean isReady;
        private int km;

        public void setValues(boolean isReady, int km) {
            this.isReady = isReady;
            this.km = km;
        }

        public void isReady(boolean isReady) {
            this.isReady = isReady;
        }

        public void info() {
            if (isReady) {
                System.out.println("The engine is working properly");
            } else {
                System.out.println("The engine is not working. He has already driven " + this.km + " km.");
            }
        }

    }
}
