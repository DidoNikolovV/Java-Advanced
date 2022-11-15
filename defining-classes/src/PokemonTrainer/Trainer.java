package PokemonTrainer;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Trainer {
    private String name;
    private int numberOfBadges;
    private List<Pokemon> pokemons;

    public Trainer(String name) {
        this.name = name;
        this.numberOfBadges = 0;
        this.pokemons = new ArrayList<>();
    }

    public void increaseBadges() {
        this.numberOfBadges++;
    }

    public void decreasePokemonsHealth() {
        this.pokemons.stream().map(p -> p.getHealth() - 10).collect(Collectors.toList());
    }

    public void destroyPokemon(Pokemon pokemon) {
        this.pokemons.remove(pokemon);
    }

    @Override
    public String toString() {
        return String.format("%s %d %d",
                this.name,
                this.numberOfBadges,
                this.pokemons.size()
        );
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfBadges() {
        return numberOfBadges;
    }

    public void setNumberOfBadges(int numberOfBadges) {
        this.numberOfBadges = numberOfBadges;
    }

    public List<Pokemon> getPokemons() {
        return pokemons;
    }

    public void setPokemons(List<Pokemon> pokemons) {
        this.pokemons = pokemons;
    }
}
