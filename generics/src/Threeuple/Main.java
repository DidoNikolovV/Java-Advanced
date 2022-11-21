package Threeuple;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");
        String firstName = input[0];
        String lastName = input[1];
        String address = input[2];
        String town = input[3];
        Threeuple<String, String, String> firstThreeuple = new Threeuple<String, String, String>(firstName + " " + lastName, address, town);
        System.out.println(firstThreeuple.toString());

        input = scanner.nextLine().split(" ");
        String name = input[0];
        int beerLiters = Integer.parseInt(input[1]);
        boolean drinkOrNot = input[2].equals("drunk");
        Threeuple<String, Integer, Boolean> secondThreeuple = new Threeuple<String, Integer, Boolean>(name, beerLiters, drinkOrNot);
        System.out.println(secondThreeuple.toString());

        input = scanner.nextLine().split(" ");
        String namee = input[0];
        double accountBalance = Double.parseDouble(input[1]);
        String bankName = input[2];
        Threeuple<String, Double, String> thirdThreeuple = new Threeuple<String, Double, String>(namee, accountBalance, bankName);
        System.out.println(thirdThreeuple.toString());


    }
}
