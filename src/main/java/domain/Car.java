package domain;

public class Car extends Vehicle {

    private int doorCount;

    public Car(String license, String model, int maxSpeed, int doorCount) {
        super(license, model, maxSpeed);
        this.doorCount = doorCount;
    }
}
