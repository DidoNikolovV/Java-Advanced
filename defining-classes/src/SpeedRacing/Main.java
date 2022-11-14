package SpeedRacing;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        List<Car> cars = new LinkedList<>();
        for(int i = 0; i < n; i++) {
            String[] carInfo = scanner.nextLine().split(" ");
            String model = carInfo[0];
            double fuelAmount = Double.parseDouble(carInfo[1]);
            double fuelCostFor1km = Double.parseDouble(carInfo[2]);

            Car car = new Car(model, fuelAmount, fuelCostFor1km);
            cars.add(car);
        }

        String input = scanner.nextLine();

        while(!input.equals("End")) {
            String[] inputParts = input.split(" ");
            String carModel = inputParts[1];
            int amountOfKm = Integer.parseInt(inputParts[2]);

            for(Car c : cars) {
                if(c.getModel().equals(carModel)) {
                    if(c.hasEnoughFuel(amountOfKm)) {
                        c.reduceFuel(amountOfKm);
                        c.increaseDistance(amountOfKm);
                    } else {
                        System.out.println("Insufficient fuel for the drive");
                    }
                }
            }
            input = scanner.nextLine();
        }

        cars.forEach(c -> System.out.println(c.toString()));
    }
}
