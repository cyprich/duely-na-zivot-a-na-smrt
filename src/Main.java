package sk.uniza.fri.main_studenti.src;

import sk.uniza.fri.main_studenti.src.heroes.*;
import sk.uniza.fri.main_studenti.src.heroselectors.FirstHeroSelector;
import sk.uniza.fri.main_studenti.src.heroselectors.WeakestHeroSelector;
import sk.uniza.fri.main_studenti.src.weapons.HPReaper;
import sk.uniza.fri.main_studenti.src.weapons.HolyHandGrenade;
import sk.uniza.fri.main_studenti.src.weapons.Weapon;
import sk.uniza.fri.main_studenti.src.weapons.WeaponType;

public class Main {

    public static void main(String[] args) {
        HeroUnit humanUnit = new HeroUnit("Humans");
        HeroUnit undeadUnit = new HeroUnit("Undeads");
        HeroUnit humanUnit2 = new HeroUnit("Great humans");
        HeroUnit undeadUnit2 = new HeroUnit("Deadly undeads");
        ArmedHero human1 = new ArmedHero(50, 2, "Fast Jano", HeroClass.WARRIOR ,new Weapon(3, WeaponType.SWORD));
        ArmedHero human2 = new ArmedHero(50, 3, "Strong Fero", HeroClass.WARRIOR, new HolyHandGrenade(3));
        Priest priest = new Priest(45, 3, "Priest Stano", new Weapon(1, WeaponType.STAFF));
        Priest priest2 = new Priest(40, 2, "Priest Marian", new Weapon(2, WeaponType.STAFF));

        Ghoul ghoul1 = new Ghoul(45, 40, "Ghoul Soul Reaper");
        Ghoul ghoul2 = new Ghoul(40, 30, "Ghoul Life Reaper");
        ArmedHero zombie1 = new ArmedHero(40, 2.5, "Small Zombie", HeroClass.ZOMBIE, new HPReaper(3));
        ArmedHero zombie2 = new ArmedHero(50, 3, "Zombie Captain", HeroClass.ZOMBIE, new HPReaper(2));

        humanUnit.recruitHero(human1);
        humanUnit.recruitHero(priest);
        undeadUnit.recruitHero(ghoul1);
        undeadUnit.recruitHero(zombie1);

        humanUnit2.recruitHero(human2);
        humanUnit2.recruitHero(priest2);
        undeadUnit2.recruitHero(ghoul2);
        undeadUnit2.recruitHero(zombie2);

        //TODO: dorobit vytvorenie areny a spustit duely
        Arena arena1 = new Arena(humanUnit, undeadUnit, new FirstHeroSelector());
        arena1.performDuelsInUnit();

        Arena arena2 = new Arena(humanUnit2, undeadUnit2, new WeakestHeroSelector());
        // arena2.performDuelsInUnit();
    }
}
