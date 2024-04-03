package sk.uniza.fri.main_studenti.src.weapons;

import sk.uniza.fri.main_studenti.src.heroes.Hero;

public class HPReaper extends Weapon {
    public HPReaper(double attackPower) {
        super(attackPower, WeaponType.HPREAPER);
    }

    @Override
    public double computeAttackPower(Hero opponent) {
        return this.getBaseAttackPower();
    }


}
