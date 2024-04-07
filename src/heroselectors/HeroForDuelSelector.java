package sk.uniza.fri.main_studenti.src.heroselectors;

import sk.uniza.fri.main_studenti.src.HeroUnit;
import sk.uniza.fri.main_studenti.src.heroes.Hero;

public interface HeroForDuelSelector {
    Hero pickHero(HeroUnit heroUnit);
}
