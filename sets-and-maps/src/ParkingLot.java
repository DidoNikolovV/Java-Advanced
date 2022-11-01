import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class ParkingLot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<String> cars = new LinkedHashSet<>();

        String input = scanner.nextLine();

        while(!input.equals("END")) {
            String direction = input.split(", ")[0];
            String carNumber = input.split(", ")[1];

            if(direction.equals("IN")) {
                cars.add(carNumber);
            } else {
                cars.remove(carNumber);
            }

            input = scanner.nextLine();
        }

        if(cars.isEmpty()) {
            System.out.println("Parking Lot is Empty");
        } else {
            cars.forEach(c -> {
                System.out.println(c);
            });
        }
        
    }
}
