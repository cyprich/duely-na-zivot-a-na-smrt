package sk.uniza.fri.main_studenti.src.heroes;

public class ArmedHero extends Hero {
    public ArmedHero(double healthPoints, double attackPower, String name, HeroClass heroClass, Weapon weapon) {
        super(healthPoints, attackPower, name, heroClass);
    }

    @Override
    protected double computeAttackPower(Hero opponent) {

    }

    public Weapon getWeapon() {

    }
}
