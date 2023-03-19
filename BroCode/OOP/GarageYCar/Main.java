package BroCode.OOP.GarageYCar;

public class Main {
    public static void main(String[] args) {
        Garage garage1 = new Garage(1, 20, 20);

        Car car1 = new Car("Toyota", "Camry", 2022, "Coupe", "Red");
        Car car2 = new Car("Hyundai", "Sonata", 2022, "Coupe", "Black");

        System.out.println(garage1.getRemainingCapacity());
        System.out.println(garage1.park(car1));
        System.out.println(garage1.park(car2));
        System.out.println(garage1.getRemainingCapacity());

    }

}
