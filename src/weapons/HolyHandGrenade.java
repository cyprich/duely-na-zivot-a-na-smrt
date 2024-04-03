package sk.uniza.fri.main_studenti.src.weapons;

import sk.uniza.fri.main_studenti.src.heroes.Hero;


public class HolyHandGrenade extends Weapon {
    public HolyHandGrenade(double attackPower) {
        super(attackPower, WeaponType.HOLYHANDGRENADE);
    }

    @Override
    public double computeAttackPower(Hero opponent) {
        return this.getBaseAttackPower();
    }
}
