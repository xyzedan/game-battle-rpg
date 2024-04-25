public class Foe extends Character{
    public Foe(String race, int level) {
        super(race, level);
    }

    public void doMagic(Hero hero) {
        MP--;
        hero.setHP(hero.getHP() - totalDamage());
    }
}
