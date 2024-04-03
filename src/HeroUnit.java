package sk.uniza.fri.main_studenti.src;

import sk.uniza.fri.main_studenti.src.heroes.Hero;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HeroUnit {
    private ArrayList<Hero> heroes;
    private String name;
    public HeroUnit(String name) {
        this.heroes = new ArrayList<>();
        this.name = name;
    }

    public List<Hero> getListOfHeroes() {
        return Collections.unmodifiableList(this.heroes);
    }

    public void removeHero(Hero hero) {
        this.heroes.remove(hero);
    }

    public int numberOfHeroes() {
        return this.heroes.size();
    }

    public void recruitHero(Hero hero) {
        this.heroes.add(hero);
    }

    public String getName() {
        return this.name;
    }
}
