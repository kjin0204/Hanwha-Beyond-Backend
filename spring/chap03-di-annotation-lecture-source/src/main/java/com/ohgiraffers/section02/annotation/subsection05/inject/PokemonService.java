package com.ohgiraffers.section02.annotation.subsection05.inject;

import com.ohgiraffers.section02.annotation.common.Pokemon;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import org.springframework.stereotype.Service;

@Service("pokemonServiceInject")
public class PokemonService {

    /* 설명. 1. Inhject 라이브러리를 활용한 필드 주입 */
//    @Inject
//    @Named("squirtle")
//    private Pokemon pokemon;

    /* 설명. 2. 생성자 주입 */
//    private Pokemon pokemon;
//    @Inject
//    @Named("pikachu")
//    public PokemonService(Pokemon pokemon) {
//        this.pokemon = pokemon;
//    }

    /* 설명. 3. setter 주입 */
    private Pokemon pokemon;

    @Inject
    @Named("squirtle")
    public void setPokemon(Pokemon pokemon) {
        this.pokemon = pokemon;
    }
    public void pokemonAttack() {
        pokemon.attack();
    }


    /* 설명. 4. List 형태로 전체 받음 */
//    private List<Pokemon> pokemon;
//
//    public PokemonService(List<Pokemon> pokemon) {
//        this.pokemon = pokemon;
//    }
//    public void pokemonAttack() {
//        pokemon.forEach(pokemon -> pokemon.attack());
//    }
}
