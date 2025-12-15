package com.ohgiraffers.section02.annotation.subsection03.collection;

import com.ohgiraffers.section02.annotation.common.Pokemon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service("pokemonServiceCollection")
public class PokemonService {

    /* 설명. 1. 같은 타입의 bean을 List 형태로 주입 */
//    private final List<Pokemon> pokemons;
//
//    @Autowired
//    public PokemonService(List<Pokemon> pokemons) {
//        this.pokemons = pokemons;
//    }
//
//    public void pokemonAttack() {
//        pokemons.forEach((pokemon) -> pokemon.attack() );
//    }

    /* 설명. 2. 같은 타입의 bean을 Map 형태로 주입 */
    private final Map<String,Pokemon> pokemons;

    @Autowired
    public PokemonService(Map<String,Pokemon> pokemons) {
        this.pokemons = pokemons;
    }

    public void pokemonAttack() {
        pokemons.forEach((key, pokemon) -> {
            System.out.println("key = " + key);
            System.out.println("pokemon = " + pokemon);
            pokemon.attack();
            System.out.println();
        } );
    }
}
