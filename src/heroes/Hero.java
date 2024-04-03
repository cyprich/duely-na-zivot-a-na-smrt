package sk.uniza.fri.main_studenti.src.heroes;

public abstract class Hero {
    public Hero(double healthPoints, double attackPower, String name, HeroClass heroClass) {

    }

    protected abstract double computeAttackPower(Hero opponent);

    public void performAttack(Hero opponent) {

    }

    public void receiveAttack(double damage) {

    }

    public boolean isAlive() {

    }

    protected void setHealthPoints() {

    }

    public double getAttackPower() {

    }

    public double getHealthPoints() {

    }

    public String getName() {

    }

    public HeroClass getHeroClass() {

    }

}
