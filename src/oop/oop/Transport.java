package oop.oop;

public class Transport {
    //Модификаторы доступа
    //public - доступны отовсюду
    //protected - поле, класс, метод доступен внутри самого класса и внутри классов наследников
    //private - закрытый, виден в пределах класса

    public float speed;
    public int weight;
    public String color;
    public byte[] coordinate;

    public void setValues(float _speed, int _weight, String _color, byte[] _coordinate) {
        speed = _speed;
        weight = _weight;
        color = _color;
        coordinate = _coordinate;
    }

    public String getValues() {
        String info = "Object speed: " + speed + ". Weight: " + weight + ". Color: " + color;
        String infoCoord = ". \nCoordinates:\n";
        for (int i = 0; i < coordinate.length; i++) {
            infoCoord += coordinate[i] + "\n";
        }
        return info + infoCoord;
    }
}
