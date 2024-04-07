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
    protected void setHealthPoints(double healthPoints) {
        super.setHealthPoints(healthPoints);
    }

    /**
     * Ozivi Ghoula, ak este nebol oziveny
     *
     * @return true ak sa podarilo ozivit, inak false
     */
    public boolean ozivSa() {
        if (!this.uzBolOziveny) {
            this.setHealthPoints(this.povodneZivoty * 0.9);
            this.uzBolOziveny = true;
            return true;
        }
        return false;
    }
}
