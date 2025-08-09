package Day_1.Oops;

public class Car {
    String brand;
    String model;
    int year;
    double price;
    Car(){
        brand=null;
        model=null;
        year=0;
        price=0.0;
    }
    Car(String b, String m, int y, double p){
        brand = b;
        model=m;
        year=y;
        price=p;

    };
    public void displayInfo(){
        System.out.println("Brand: " + brand + ", Model: " + model +
                           ", Year: " + year + ", Price: $" + price);
    }
public static void main(String[] args) {
   
    Car c1 = new Car();
        c1.brand = "Toyota";
        c1.model = "Corolla";
        c1.year = 2020;
        c1.price = 20000;
       
        Car c2 = new Car("Honda", "Civic", 2021, 22000);
        Car c3 = new Car("Ford", "Mustang", 2022, 35000);
   

    
        c1.displayInfo();
        c2.displayInfo();
        c3.displayInfo();
}
    
}
