package sk.uniza.fri.main_studenti.src.heroes;

public enum HeroClass {
    GHOUL,
    ZOMBIE,
    WARRIOR,
    PRIEST;

    boolean isUndead() {
        return this == GHOUL || this == ZOMBIE;
    }
}
