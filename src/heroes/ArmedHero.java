package sk.uniza.fri.main_studenti.src.heroes;

import sk.uniza.fri.main_studenti.src.weapons.Weapon;
import sk.uniza.fri.main_studenti.src.weapons.WeaponType;

public class ArmedHero extends Hero {
    private Weapon weapon;

    public ArmedHero(double healthPoints, double attackPower, String name, HeroClass heroClass, Weapon weapon) {
        super(healthPoints, attackPower, name, heroClass);
        this.weapon = weapon;
    }

    @Override
    protected double computeAttackPower(Hero opponent) {
        if (this.weapon.getWeaponType() == WeaponType.HPREAPER && opponent.getHeroClass() == HeroClass.WARRIOR) {
            return opponent.getHealthPoints() / 4;
        } else if (this.weapon.getWeaponType() == WeaponType.HOLYHANDGRENADE && opponent.getHeroClass().isUndead()) {
            return this.getAttackPower() * this.weapon.getBaseAttackPower() * 2;
        }
        return this.getAttackPower() * this.weapon.getBaseAttackPower();
    }

    public Weapon getWeapon() {
        return this.weapon;
    }
}
