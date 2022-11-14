package RawData;

import java.util.ArrayList;
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
            int engineSpeed = Integer.parseInt(carInfo[1]);
            int enginePower = Integer.parseInt(carInfo[2]);
            int cargoWeight = Integer.parseInt(carInfo[3]);
            String cargoType = carInfo[4];
            List<Tire> tires = new ArrayList<>();
            for(int j = 5; j < carInfo.length - 1; j+=2) {
                double tirePressure = Double.parseDouble(carInfo[j]);
                int tireAge = Integer.parseInt(carInfo[j+1]);
                Tire tire = new Tire(tirePressure, tireAge);
                tires.add(tire);
            }

            Engine engine = new Engine(engineSpeed, enginePower);
            Cargo cargo = new Cargo(cargoWeight, cargoType);
            Car car = new Car(model, engine, cargo, tires);
            cars.add(car);
        }

        String command = scanner.nextLine();
        if(command.equals("fragile")) {
            cars.stream().filter(c -> c.getCargo().getType().equals("fragile") && c.calculatePressure() < 1)
                    .forEach(c -> System.out.println(c.getModel()));
        } else if(command.equals("flamable")) {
            cars.stream().filter(c -> c.getCargo().getType().equals("flamable") && c.getEngine().getPower() > 250)
                    .forEach(c -> System.out.println(c.getModel()));
        }
    }
}
