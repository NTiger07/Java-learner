package BroCode;

import java.util.*;

public class TwoDimensionLists {

    public static void twoDimensionLists(String[] args) {
        ArrayList<ArrayList<String>> groceryList = new ArrayList<ArrayList<String>>();

        ArrayList<String> drinksList = new ArrayList<String>();

        drinksList.add("Fanta");
        drinksList.add("Sprite");
        drinksList.add("Hollandia");

        ArrayList<String> produceList = new ArrayList<String>();

        produceList.add("Tomato");
        produceList.add("Pepper");
        produceList.add("Garlic");

        ArrayList<String> pastryList = new ArrayList<String>();

        pastryList.add("Donut");
        pastryList.add("Meatpie");
        pastryList.add("Fishroll");

        groceryList.add(drinksList);
        groceryList.add(produceList);
        groceryList.add(pastryList);

        System.out.println(groceryList);
    }
}
