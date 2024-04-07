package sk.uniza.fri.main_studenti.src.heroes;

import sk.uniza.fri.main_studenti.src.weapons.Weapon;
import sk.uniza.fri.main_studenti.src.weapons.WeaponType;

public class Priest extends ArmedHero {
    public Priest(double healthPoints, double attackPower, String name, Weapon weapon) {
        super(healthPoints, attackPower, name, HeroClass.PRIEST, weapon);
    }

    @Override
    protected double computeAttackPower(Hero opponent) {
        if (this.getWeapon().getWeaponType() == WeaponType.STAFF) {
            return this.getAttackPower() * this.getWeapon().getBaseAttackPower() * 10;
        }
        return this.getAttackPower() * getWeapon().getBaseAttackPower();
    }
}
