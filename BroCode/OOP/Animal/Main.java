package BroCode.OOP.Animal;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Animal animal1;

        System.out.println("What animal do you want");
        System.out.print("1 = dog and 2 = cat: ");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                animal1 = new Dog();
                animal1.speak();
                break;

            case 2:
                animal1 = new Cat();
                animal1.speak();
                break;

            default:
                System.out.println("That choice is invalid");
                break;
        }
        scanner.close();
    }
}
