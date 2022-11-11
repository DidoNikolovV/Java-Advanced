import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<Car> cars = new LinkedList<>();

        while(n-- > 0) {
            String[] inputParts = scanner.nextLine().split(" ");
            String brand = inputParts[0];
            String model = "unknown";
            int horsePower = -1;

            if(inputParts.length == 2) {
                model = inputParts[1];
            } else if(inputParts.length == 3) {
                model = inputParts[1];
                horsePower = Integer.parseInt(inputParts[2]);
            }

            Car car = new Car(brand, model, horsePower);
            cars.add(car);

        }

        cars.forEach(car -> System.out.println(car.carInfo()));

    }
}