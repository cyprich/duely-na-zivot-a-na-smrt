package sk.uniza.fri.main_studenti.src.heroes;

public class Ghoul extends Hero {
    private boolean uzBolOziveny = false;
    private double povodneZivoty;

    public Ghoul(double healthPoints, double attackPower, String name) {
        super(healthPoints, attackPower, name, HeroClass.GHOUL);
        this.povodneZivoty = healthPoints;
    }

    @Override
    protected double computeAttackPower(Hero opponent) {
        return this.getAttackPower();
    }

    @Override
    public void receiveAttack(double damage) {
        super.receiveAttack(damage);
        if (this.getHealthPoints() <= 0 && !this.ozivSa()) {
            this.zomri();
        }
    }

    /**
     * Oživí ghoula, ak ešte nebol oziveny.
     *
     * @return true, ak sa podarilo oživiť, inak false
     */
    private boolean ozivSa() {
        if (!this.uzBolOziveny) {
            this.setHealthPoints(this.povodneZivoty * 0.9);
            this.uzBolOziveny = true;
            return true;
        }
        return false;
    }
}
