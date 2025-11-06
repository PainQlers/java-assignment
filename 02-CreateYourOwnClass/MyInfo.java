class Car {
    String brand;
    int speed;

    void setBrand(String brand) {
        this.brand = brand;
    }

    void setSpeed(int speed) {
        this.speed = speed;
    }

    String getBrand() {
        return this.brand;
    }

    int getSpeed() {
        return this.speed;
    }

}

class MyCar extends Car {
    void displayInfo() {
        System.out.println("Car brand: " + getBrand() + ", Speed: " + getSpeed() + " km/h");
    }
}

public class MyInfo {
    public static void main(String[] args) {
        MyCar car = new MyCar();
        car.setBrand("Toyota");
        car.setSpeed(120);
        car.displayInfo();
    }
}