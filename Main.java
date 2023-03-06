class Main {
    public static void main(String[] args) {
        int num1 = 15;
        int num2 = 20;

        System.out.println("We are " + num1 + num2 + " years old");
        dataTypes(null);
    }

    public static void dataTypes(String[] args) {
        // Integer types
        byte aSingleByte = 100;
        short aSmallNumber = 20000;
        int anInteger = 2147454656;
        long aLargeNumber = 7757586773473434434L;

        // Decimal types
        double aDouble = 1.79769313;
        float aFloat = 3.4028F;

        // Booleans
        boolean isMessiTheGOAT = true;
        boolean isJavaEasy = false;

        // Characters
        char copyrightSymbol = '\u00A9';

        System.out.print("This is the copyright symbol " + copyrightSymbol);
    }
}