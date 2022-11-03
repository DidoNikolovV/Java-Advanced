import java.util.*;

public class HandsOfCards {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<String, Set<String>> decksData = new LinkedHashMap<>();

        Map<String, Integer> powers = Map.of(
                "J", 11,
                "Q", 12,
                "K", 13,
                "A", 14
        );

        Map<String, Integer> types = Map.of(
                "S", 4,
                "H", 3,
                "D", 2,
                "C", 1
        );

        while(!input.equals("JOKER")) {
            String[] inputParts = input.split(": ");
            String name = inputParts[0];
            String[] cards = inputParts[1].split(", ");

            if(!decksData.containsKey(name)) {
                decksData.put(name, new LinkedHashSet<>());
            }

            for(String card : cards) {
                decksData.get(name).add(card);
            }
            input = scanner.nextLine();
        }

        for(var entry: decksData.entrySet()) {
            int totalValue = 0;
            for(String card : entry.getValue()) {
                String type = String.valueOf(card.charAt(card.length() - 1));
                int typeIndex = card.indexOf(type);
                String power = card.substring(0, typeIndex);
                if(power.equals("J") || power.equals("Q") || power.equals("K") || power.equals("A")) {
                    power = String.valueOf(powers.get(power));
                }

                if(type.equals("S") || type.equals("H") || type.equals("D") || type.equals("C")) {
                    type = String.valueOf(types.get(type));
                }

                totalValue += Integer.parseInt(power) * Integer.parseInt(type);
            }
            System.out.printf("%s: %d%n", entry.getKey(), totalValue);
        }
    }
}
