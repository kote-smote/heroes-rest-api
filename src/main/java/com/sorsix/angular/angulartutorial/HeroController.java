package com.sorsix.angular.angulartutorial;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class HeroController {

    List<Hero> heroes = Arrays.asList(
            new Hero(11, "Mr. Nice"),
            new Hero(12, "Narco"),
            new Hero(13, "Bombasto"),
            new Hero(14, "Magneta"),
            new Hero(15, "RubberMan"),
            new Hero(16, "Dynama")
    );

    @GetMapping("/api/heroes")
    public List<Hero> getHeroes() {
        double rand = Math.random();
        if(rand > 0.7) {
            throw new RuntimeException("Error in api");
        } else {
            return heroes;
        }
    }

    @GetMapping("api/heroes/{id}")
    public Hero getHero(@PathVariable int id) {
        return heroes.stream().filter(it -> it.getId() == id)
                .findFirst().orElse(null);
    }
}

