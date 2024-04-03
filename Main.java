package sk.uniza.fri.main_studenti;

import sk.uniza.fri.HeroUnit;
import sk.uniza.fri.heroes.ArmedHero;
import sk.uniza.fri.heroes.Ghoul;
import sk.uniza.fri.heroes.HeroClass;
import sk.uniza.fri.heroes.Priest;
import sk.uniza.fri.weapons.HPReaper;
import sk.uniza.fri.weapons.HolyHandGrenade;
import sk.uniza.fri.weapons.Weapon;
import sk.uniza.fri.weapons.WeaponType;

public class Main {

    public static void main(String[] args) {
        HeroUnit humanUnit = new HeroUnit("Humans");
        HeroUnit undeadUnit = new HeroUnit("Undeads");
        HeroUnit humanUnit2 = new HeroUnit("Great humans");
        HeroUnit undeadUnit2 = new HeroUnit("Deadly undeads");
        ArmedHero human1 = new ArmedHero(50, 2, "Fast Jano", new Weapon(3, WeaponType.SWORD), HeroClass.WARRIOR);
        ArmedHero human2 = new ArmedHero(50, 3, "Strong Fero", new HolyHandGrenade(3), HeroClass.WARRIOR);
        Priest priest = new Priest(45, 3, "Priest Stano", new Weapon(1, WeaponType.STAFF));
        Priest priest2 = new Priest(40, 2, "Priest Marian", new Weapon(2, WeaponType.STAFF));

        Ghoul ghoul1 = new Ghoul(45, 40, "Ghoul Soul Reaper");
        Ghoul ghoul2 = new Ghoul(40, 30, "Ghoul Life Reaper");
        ArmedHero zombie1 = new ArmedHero(40, 2.5, "Small Zombie", new HPReaper(3), HeroClass.ZOMBIE);
        ArmedHero zombie2 = new ArmedHero(50, 3, "Zombie Captain", new HPReaper(2), HeroClass.ZOMBIE);

        humanUnit.recruitHero(human1);
        humanUnit.recruitHero(priest);
        undeadUnit.recruitHero(ghoul1);
        undeadUnit.recruitHero(zombie1);

        humanUnit2.recruitHero(human2);
        humanUnit2.recruitHero(priest2);
        undeadUnit2.recruitHero(ghoul2);
        undeadUnit2.recruitHero(zombie2);

        //TODO: dorobit vytvorenie areny a spustit duely

    }
}
