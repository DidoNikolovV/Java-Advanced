import java.util.*;

public class CitiesByContinentAndCountry {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int continentsCount = Integer.parseInt(scanner.nextLine());

        Map<String, Map<String, List<String>>> continentData = new LinkedHashMap<>();

        for(int i = 0; i < continentsCount; i++) {
            String[] input = scanner.nextLine().split(" ");
            String continent = input[0];
            String country = input[1];
            String city = input[2];


            if(!continentData.containsKey(continent)) {
                Map<String, List<String>> countryData = new LinkedHashMap<>();
                List<String> citiesData = new ArrayList<>();
                citiesData.add(city);
                countryData.put(country, citiesData);
                continentData.put(continent, countryData);
            } else {
                if(!continentData.get(continent).containsKey(country)) {
                    List<String> citiesData = new ArrayList<>();
                    citiesData.add(city);
                    continentData.get(continent).put(country, citiesData);
                } else {
                    continentData.get(continent).get(country).add(city);
                }
            }
        }

        for(var continent: continentData.entrySet()) {
            System.out.println(continent.getKey() + ":");
            for(var country: continent.getValue().entrySet()) {
                System.out.print(" " + country.getKey() + " -> ");
                System.out.println(String.join(", ", country.getValue()));
            }
        }
    }
}
