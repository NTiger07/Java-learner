package BroCode.OOP;

public class Main {
    public static void main() {
        Garage garage1 = new Garage(1, 20, 20);

        Car car1 = new Car("Toyota", "Camry", 2022, "Coupe", "Red");

        garage1.park(car1);
        System.out.println(garage1);
        System.out.println(car1);
    }

}
