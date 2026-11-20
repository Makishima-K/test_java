package module10;

import java.util.HashMap;

/**
 * Stores electronic items with their prices in a {@link HashMap}
 * and looks up the price of an item by its name.
 *
 * @author Maksims Karnakovs
 */
public class ElectronicItemDetails {

    /**
     * Creates a new electronic item details object.
     */
    public ElectronicItemDetails() {
    }

    /**
     * Returns the price of the item with the given name.
     *
     * @param itemHashMap map where the key is the item name and the value is its price
     * @param name        the name of the item to look up
     * @return the price of the item, or 0.0 if there is no item with this name in the map
     */
    public double returnPriceOfItem(HashMap<String, Double> itemHashMap, String name) {
        return itemHashMap.getOrDefault(name, 0.0);
    }

    /**
     * Entry point of the program.
     * Adds 4 electronic items to the map and prints the price of the TV.
     *
     * @param args command line arguments (not used)
     */
    public static void main(String[] args) {
        // 5.1 - Create itemHashMap with String name and double price
        HashMap<String, Double> itemHashMap = new HashMap<String, Double>();

        // 5.3.1 - Add 4 items to the map
        itemHashMap.put("TV", 499.99);
        itemHashMap.put("Refrigerator", 899.50);
        itemHashMap.put("Washing Machine", 649.00);
        itemHashMap.put("Laptop", 1199.99);

        // 5.3.2 - Print the price of the TV
        ElectronicItemDetails itemDetails = new ElectronicItemDetails();
        System.out.println("Price of TV is " + itemDetails.returnPriceOfItem(itemHashMap, "TV"));
    }
}
