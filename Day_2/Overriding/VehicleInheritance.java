package Day_2.Overriding;

class Vehicle {
    public void start() { System.out.println("Vehicle starting"); }
    public void displayInfo() { System.out.println("This is a vehicle"); }
}

class Car extends Vehicle {
    String model;
    public Car(String model) { this.model = model; }
    @Override
    public void start() { System.out.println(model + " car starting"); }
    @Override
    public void displayInfo() { System.out.println("Car model: " + model); }
}

class Bike extends Vehicle {
    String brand;
    public Bike(String brand) { this.brand = brand; }
    @Override
    public void start() { System.out.println(brand + " bike roaring"); }
    @Override
    public void displayInfo() { System.out.println("Bike brand: " + brand); }
}

class Truck extends Vehicle {
    int loadCapacity;
    public Truck(int loadCapacity) { this.loadCapacity = loadCapacity; }
    @Override
    public void start() { System.out.println("Truck with " + loadCapacity + " tons starting"); }
    @Override
    public void displayInfo() { System.out.println("Truck capacity: " + loadCapacity + " tons"); }
}

public class VehicleInheritance {
    public static void main(String[] args) {
        // Using polymorphism
        Vehicle v1 = new Car("Toyota Corolla");
        Vehicle v2 = new Bike("Honda");
        Vehicle v3 = new Truck(15);

        v1.start();
        v1.displayInfo();

        v2.start();
        v2.displayInfo();

        v3.start();
        v3.displayInfo();

        // Direct object references
        System.out.println("\nDirect Object Calls ");
        Car car = new Car("Suzuki Alto");
        car.start();
        car.displayInfo();

        Bike bike = new Bike("Yamaha");
        bike.start();
        bike.displayInfo();

        Truck truck = new Truck(25);
        truck.start();
        truck.displayInfo();
    }
}
