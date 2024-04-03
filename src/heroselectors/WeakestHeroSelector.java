package sk.uniza.fri.main_studenti.src.heroselectors;

import sk.uniza.fri.main_studenti.src.HeroUnit;
import sk.uniza.fri.main_studenti.src.heroes.Hero;

import java.util.List;

public class WeakestHeroSelector implements HeroForDuelSelector {
    @Override
    public Hero pickHero(HeroUnit heroUnit) {
        List<Hero> hrdinovia = heroUnit.getListOfHeroes();
        Hero najslabsi = hrdinovia.get(0);

        for (Hero h : hrdinovia) {
            if (h.getAttackPower() < najslabsi.getAttackPower()) {
                najslabsi = h;
            }
        }

        return najslabsi;
    }
}
