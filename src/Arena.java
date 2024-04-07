package sk.uniza.fri.main_studenti.src;

import sk.uniza.fri.main_studenti.src.heroes.Ghoul;
import sk.uniza.fri.main_studenti.src.heroes.Hero;
import sk.uniza.fri.main_studenti.src.heroselectors.HeroForDuelSelector;

public class Arena {
    private HeroUnit heroUnit1;
    private HeroUnit heroUnit2;
    private HeroForDuelSelector duelSelector;

    public Arena(HeroUnit heroUnit1, HeroUnit heroUnit2, HeroForDuelSelector duelSelector) {
        this.heroUnit1 = heroUnit1;
        this.heroUnit2 = heroUnit2;
        this.duelSelector = duelSelector;
    }

    public void performDuelsInUnit() {
        System.out.println("Starting duels between units: \n  " + this.heroUnit1.getName() + "\n  " + this.heroUnit2.getName());
        boolean ktoIdeUtocit = true;  // true = postava z heroUnit1, false = postava z heroUnit2

        while (this.heroUnit1.numberOfHeroes() > 0 && this.heroUnit2.numberOfHeroes() > 0) {
            Hero hero1 = this.duelSelector.pickHero(heroUnit1);
            Hero hero2 = this.duelSelector.pickHero(heroUnit2);

            while (hero1.isAlive() && hero2.isAlive()) {
                if (ktoIdeUtocit) {
                    hero1.performAttack(hero2);
                } else {
                    hero2.performAttack(hero1);
                }

                if (this.skusOzivit(hero1)) {
                    System.out.println("Hero " + hero1.getName() + " was resurrected with " + hero1.getHealthPoints() + " HP!");
                }
                if (this.skusOzivit(hero2)) {
                    System.out.println("Hero " + hero2.getName() + " was resurrected with " + hero1.getHealthPoints() + " HP!");
                }
                ktoIdeUtocit = !ktoIdeUtocit;
            }

            if (!hero1.isAlive()) {
                System.out.println("Hero " + hero1.getName() + " was killed by " + hero2.getName());
                this.heroUnit1.removeHero(hero1);
            }
            if (!hero2.isAlive()) {
                System.out.println("Hero " + hero2.getName() + " was killed by " + hero1.getName());
                this.heroUnit2.removeHero(hero2);
            }
        }
        System.out.println("Winning unit is: " + (this.heroUnit1.numberOfHeroes() == 0 ? this.heroUnit2.getName() : this.heroUnit1.getName()) + "\n\n");
    }

    /**
     * Zavola metodu ozivSa pre Ghoula
     *
     * @return true ak sa podari, false ak nie
     */
    public boolean skusOzivit(Hero hero) {
        if (hero instanceof Ghoul && !hero.isAlive()) {
            return ((Ghoul) hero).ozivSa();
        }
        return false;
    }
}
