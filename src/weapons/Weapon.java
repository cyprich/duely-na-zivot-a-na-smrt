package sk.uniza.fri.main_studenti.src.weapons;

import sk.uniza.fri.main_studenti.src.heroes.Hero;

public class Weapon {
    private double attackPower;
    private WeaponType weaponType;

    public Weapon(double attackPower, WeaponType weaponType) {
        this.attackPower = attackPower;
        this.weaponType = weaponType;
    }

    public double computeAttackPower(Hero opponent) {
        return this.attackPower;
    }

    public double getBaseAttackPower() {
        return this.attackPower;
    }

    public WeaponType getWeaponType() {
        return this.weaponType;
    }

}
