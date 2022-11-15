package PokemonTrainer;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();
        Map<String, List<Pokemon>> trainersPokemons = new HashMap<>();
        List<Trainer> trainers = new LinkedList<>();
        while(!line.equals("Tournament")) {
            String[] data = line.split(" ");
            String trainerName = data[0];
            String pokemonName = data[1];
            String pokemonElement = data[2];
            int pokemonHealth = Integer.parseInt(data[3]);
            Pokemon pokemon = new Pokemon(pokemonName, pokemonElement, pokemonHealth);
            Trainer trainer = new Trainer(trainerName);
            if(!trainersPokemons.containsKey(trainerName)) {
                List<Pokemon> pokemons = new ArrayList<>();
                trainersPokemons.put(trainerName, pokemons);
            }

            List<Trainer> foundTrainers = trainers.stream().filter(t -> t.getName().equals(trainerName)).collect(Collectors.toList());
            if(foundTrainers.size() == 0) {
                trainers.add(trainer);
            }

            List<Pokemon> oldPokemons = trainersPokemons.get(trainerName);
            oldPokemons.add(pokemon);
            trainersPokemons.put(trainerName, oldPokemons);

            line = scanner.nextLine();
        }

        for(Trainer t : trainers) {
            String currTrainerName = t.getName();
            List<Pokemon> currTrainerPokemons = trainersPokemons.get(currTrainerName);
            t.setPokemons(currTrainerPokemons);
        }

        line = scanner.nextLine();
        while(!line.equals("End")) {
            String element = line;
            for(Trainer t : trainers) {
                if(t.getPokemons().stream().filter(p -> p.getElement().equals(element)).collect(Collectors.toList()).size() == 0) {
                    t.decreasePokemonsHealth();
                    t.setPokemons(t.getPokemons().stream().filter(p -> p.getHealth() > 0).collect(Collectors.toList()));
                } else {
                    t.increaseBadges();
                }

            }

            line = scanner.nextLine();
        }

        trainers.sort((t1, t2) -> t2.getNumberOfBadges() - t1.getNumberOfBadges());
        trainers.stream().forEach(t -> System.out.println(t.toString()));


    }
}
