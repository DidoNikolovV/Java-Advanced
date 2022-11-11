import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        while(n-- > 0) {
            String[] inputParts = scanner.nextLine().split(" ");
            String brand = inputParts[0];
            String model = inputParts[1];
            int horsePower = Integer.parseInt(inputParts[2]);

            Car car = new Car();
            car.setBrand(brand);
            car.setModel(model);
            car.setHorsePower(horsePower);

            System.out.println(car.carInfo());
        }

    }
}