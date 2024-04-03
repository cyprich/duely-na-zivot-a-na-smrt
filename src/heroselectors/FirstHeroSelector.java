package sk.uniza.fri.main_studenti.src.heroselectors;

import sk.uniza.fri.main_studenti.src.HeroUnit;
import sk.uniza.fri.main_studenti.src.heroes.Hero;

public class FirstHeroSelector implements HeroForDuelSelector{
    @Override
    public Hero pickHero(HeroUnit heroUnit) {
        return heroUnit.getListOfHeroes().get(0);
    }

}
