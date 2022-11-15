package CarSalesman;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        List<Engine> engines = new ArrayList<>();
        List<Car> cars = new LinkedList<>();

        for(int i = 0; i < n; i++) {
            String[] engineData = scanner.nextLine().split(" ");
            String model = engineData[0];
            int power = Integer.parseInt(engineData[1]);
            Engine engine = null;
            switch(engineData.length) {
                case 2:
                    engine = new Engine(model, power);
                    break;
                case 3:
                    if(engineData[2].matches("\\d+")) {
                        int displacement = Integer.parseInt(engineData[2]);
                        engine = new Engine(model, power, displacement);
                    } else {
                        String efficiency = engineData[2];
                        engine = new Engine(model, power, efficiency);
                    }
                    break;
                case 4:
                    int displacement = Integer.parseInt(engineData[2]);
                    String efficiency = engineData[3];
                    engine = new Engine(model, power, displacement, efficiency);
                    break;
            }

            engines.add(engine);
        }

        int numberOfCars = Integer.parseInt(scanner.nextLine());
        for(int i = 0; i < numberOfCars; i++) {
            String[] carData = scanner.nextLine().split(" ");
            String model = carData[0];
            String engine = carData[1];
            Engine currentEngine = engines.stream().filter(e -> e.getModel().equals(engine)).collect(Collectors.toList()).get(0);

            Car car = null;
            switch(carData.length) {
                case 2:
                    car = new Car(model, currentEngine);
                    break;
                case 3:
                    if(carData[2].matches("\\d+")) {
                        int weight = Integer.parseInt(carData[2]);
                        car = new Car(model, currentEngine, weight);
                    } else {
                        String color = carData[2];
                        car = new Car(model, currentEngine, color);
                    }
                    break;
                case 4:
                    int weight = Integer.parseInt(carData[2]);
                    String color = carData[3];
                    car = new Car(model, currentEngine, weight, color);
                    break;
            }

            cars.add(car);
        }

        cars.forEach(c -> System.out.print(c.toString()));

    }
}
