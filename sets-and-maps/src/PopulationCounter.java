import java.util.*;

public class PopulationCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<String, LinkedHashMap<String, Integer>> countriesData= new TreeMap<>();

        while(!input.equals("report")) {;
            String[] inputParts = input.split("\\|");
            String city = inputParts[0];
            String country = inputParts[1];
            int population = Integer.parseInt(inputParts[2]);

            if(!countriesData.containsKey(country)) {
                countriesData.put(country, new LinkedHashMap<>() {{put (city, population);}});
            } else {
                if(!countriesData.get(country).containsKey(city)) {
                    countriesData.get(country).put(city, population);
                } else {
                    int oldPopulation = countriesData.get(country).get(city);
                    LinkedHashMap<String, Integer> cityData = countriesData.get(city);
                    cityData.put(city, oldPopulation + population);
                    countriesData.put(country, cityData);
                }

            }
            input = scanner.nextLine();
        }



        for(var country: countriesData.entrySet()) {
            int totalPopulation = 0;
            for(var city: country.getValue().entrySet()) {
                totalPopulation += city.getValue();
            }
            System.out.printf("%s (total population): %d%n", country.getKey(), totalPopulation);
        }
    }
}
