package oopsConcepts;



public class Main {
    public static void main(String[] args) {
        Car myCar = new Car("Toyota", 120);
        System.out.println("Brand: " + myCar.getBrand());
        System.out.println("Speed: " + myCar.getSpeed());

        // Modify speed using setter
        myCar.setSpeed(150);
        System.out.println("Updated Speed: " + myCar.getSpeed());
        System.out.println(myCar.name);
    }
}

class Car {
    // Private fields (Encapsulation)
    private String brand;
    private int speed;
    public String name ="swapnil";

    // Constructor
    public Car(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    // Public getter and setter methods
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        if(speed > 0) {
            this.speed = speed;
        }
    }
}


