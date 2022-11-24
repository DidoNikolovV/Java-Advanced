package energyDrinks;


import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.stream.Collectors;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<Integer> milligramsOfCaffeine = new ArrayDeque<>();
        ArrayDeque<Integer> energyDrinks = new ArrayDeque<>();

        int[] caffeineInput = Arrays.stream(scanner.nextLine().trim().split(",\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
        int[] energyDrinksInput =  Arrays.stream(scanner.nextLine().split(",\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        for (int caffeine : caffeineInput) {
            milligramsOfCaffeine.push(caffeine);
        }

        for (int energyDrink : energyDrinksInput) {
            energyDrinks.offer(energyDrink);
        }

        int maxCaffeine = 300;
        int initialCaffeine = 0;

        while(!milligramsOfCaffeine.isEmpty() && !energyDrinks.isEmpty()) {
            int currentMgOfCaffeine = milligramsOfCaffeine.pop();
            int currentEnergyDrink = energyDrinks.poll();
            int drinkCaffeine = currentMgOfCaffeine * currentEnergyDrink;
            if(drinkCaffeine + initialCaffeine <= maxCaffeine) {
                initialCaffeine += drinkCaffeine;
            } else {
                energyDrinks.offer(currentEnergyDrink);
                initialCaffeine -= 30;
                if(initialCaffeine < 0) {
                    initialCaffeine = 0;
                }
            }
        }

        if(!energyDrinks.isEmpty()) {
            String result = energyDrinks.stream().map(String::valueOf).collect(Collectors.joining(", "));
            System.out.println("Drinks left: " + result);
        } else {
            System.out.println("At least Stamat wasn't exceeding the maximum caffeine.");
        }

        System.out.println("Stamat is going to sleep with " + initialCaffeine + " mg caffeine.");
    }
}
