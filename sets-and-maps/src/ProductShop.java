import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class ProductShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();

        Map<String, LinkedHashMap<String, Double>> foodShops = new TreeMap<>();

        while(!command.equals("Revision")) {
            String[] cmdParts = command.split(", ");
            String shop = cmdParts[0];
            String product = cmdParts[1];
            double price = Double.parseDouble(cmdParts[2]);

            if(foodShops.get(shop) !=null) {
                LinkedHashMap<String, Double> currentProducts = foodShops.get(shop);
                currentProducts.put(product, price);
                foodShops.put(shop, currentProducts);
            } else {
                LinkedHashMap<String, Double> foodPrices = new LinkedHashMap<>();
                foodPrices.put(product, price);
                foodShops.put(shop, foodPrices);
            }

            command = scanner.nextLine();
        }

        for(var shop: foodShops.entrySet()) {
            System.out.println(shop.getKey() + "->");
            shop.getValue().forEach((product, price) -> {
                System.out.printf("Product: %s, Price: %.1f%n", product, price);
            });
        }
    }
}
