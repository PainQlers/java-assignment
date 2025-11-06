class Vehicle {
    String brand;
    void start() {
        System.out.println(brand + "'s starting engine.");
    }
}

class Car extends Vehicle {
    void drive () {
        System.out.println(brand + "'s driving in the road.");
    }
}

public class MyInfo {
    public static void main (String[] args) {
        Car mycar = new Car();
        mycar.brand = "Toyota";
        mycar.start();
        mycar.drive();
    }
}