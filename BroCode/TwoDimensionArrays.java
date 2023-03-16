package BroCode;

public class TwoDimensionArrays {

    public static void twoDimensionArray(String[] args) {
        String[][] cars = {
                { "Camaro", "Camry", "Sienna" },
                { "Corvette", "Mustang", "Ranger" },
                { "Lambo", "Ferrari", "Tesla" }
        };

        for (int i = 0; i < cars.length; i++) {
            System.out.println();
            for (int j = 0; j < cars[i].length; j++) {
                System.out.print(cars[i][j] + " ");
            }
        }

    }
}
