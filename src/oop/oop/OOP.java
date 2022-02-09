package oop.oop;

public class OOP {
    public static void main(String[] args) {
        //Transport bmw = new Transport(250.5f, 2500, "White", new byte[]{0, 0, 0});
        //bmw.setValues(250.5f, 2500, "White", new byte[]{0, 0, 0});
//        String res1 = bmw.getValues();
//        System.out.println(res1);
//        bmw.speed = 250.5f;
//        bmw.weight = 2500;
//        bmw.color = "White";
//        bmw.coordinate = new byte[]{0, 0, 0};

        //Transport truck = new Transport(5600, new byte[]{100, 0, 100});
//        Transport truck = new Transport();
//        truck.speed = 140.5f;
//        truck.weight = 5600;
//        truck.color = "Red";
//        truck.coordinate = new byte[]{100, 0, 100};
//
//        String res2 = truck.getValues();
//        System.out.println(res2);

//        Car bmw = new Car(250.5f, 2500, "White", new byte[]{0, 0, 0});
//        bmw.engine.setValues(false, 2000);
//        bmw.engine.info();
//
//        Truck truck = new Truck(5600, new byte[]{100, 0, 100}, false);
//        truck.engine.setValues(true, 500);
//        truck.engine.info();

//        truck.setLoaded(true);
//        truck.getLoaded();

//        truck.setValues(250.5f, 2500, "White", new byte[]{0, 0, 0});
//        System.out.println(truck.getValues());

//        Car flyCar = new Car(250.5f, 2500, "White", new byte[]{0, 0, 0}) {
//            @Override
//            public void moveObject(float speed) {
//                super.moveObject(speed);
//
//                this.engine.isReady(true);
//                System.out.println("Car is flying");
//            }
//        };
//
//        flyCar.moveObject(450);

        //final int count = 10; //constant

//        Person.count = 5;
//        System.out.println(Person.count);
//
//        Person obj1 = new Person();
//        Person obj2 = new Person();
//        Person obj3 = new Person();
//        Person obj4 = new Person();
//        obj4.getCount();


        Car bmw = new Car();
        bmw.setLight(true);
        bmw.blinkLight();
    }
}
