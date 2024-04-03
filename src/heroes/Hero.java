package sk.uniza.fri.main_studenti.src.heroes;

public abstract class Hero {
    private double healthPoints;
    private double attackPower;
    private String name;
    private HeroClass heroClass;
    private boolean alive;

    public Hero(double healthPoints, double attackPower, String name, HeroClass heroClass) {
        this.healthPoints = healthPoints;
        this.attackPower = attackPower;
        this.name = name;
        this.heroClass = heroClass;
        this.alive = true;
    }

    protected abstract double computeAttackPower(Hero opponent);

    public void performAttack(Hero opponent) {
        double damage = this.computeAttackPower(opponent);
        opponent.receiveAttack(damage);
        System.out.println("Hero " + this.name + " attacked hero " + opponent.getName() + " and dealt " + damage + " damage leaving him " + opponent.getHealthPoints() + " HP.");
    }

    public void receiveAttack(double damage) {
        this.healthPoints -= damage;
        if (this.healthPoints <= 0) {
            this.zomri();
        }
    }

    public boolean isAlive() {
        return this.alive;
    }

    protected void setHealthPoints(double healthPoints) {
        this.healthPoints = healthPoints;
    }

    public double getAttackPower() {
        return this.attackPower;
    }

    public double getHealthPoints() {
        return this.healthPoints;
    }

    public String getName() {
        return this.name;
    }

    public HeroClass getHeroClass() {
        return this.heroClass;
    }

    public void zomri() {
        this.alive = false;
    }
}
