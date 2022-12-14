package Tuple;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");
        String firstName = input[0];
        String secondName = input[1];
        String  address = input[2];
        Tuple<String, String> tuple = new Tuple<String, String>(firstName + " " + secondName, address);
        System.out.println(tuple.toString());

        input = scanner.nextLine().split(" ");
        String name = input[0];
        int beerLiters = Integer.parseInt(input[1]);
        Tuple<String, Integer> secondTuple = new Tuple<String, Integer>(name, beerLiters);
        System.out.println(secondTuple.toString());

        input = scanner.nextLine().split(" ");
        int integerNumber = Integer.parseInt(input[0]);
        double doubleNumber = Double.parseDouble(input[1]);
        Tuple<Integer, Double> thirdTuple = new Tuple<Integer, Double>(integerNumber, doubleNumber);
        System.out.println(thirdTuple.toString());


    }
}
