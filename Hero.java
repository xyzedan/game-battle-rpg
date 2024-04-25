public class Hero extends Character {
    protected String name;
    protected Armor armor;

    protected Hero(String name, String race, int level) {
        super(race, level);
        this.name = name;
        this.race = race;
    }

    public void doAttack(Foe foe) {
        MP--;
        foe.setHP(foe.getHP() - totalDamage());
    }

    public void setArmor(Armor armor) {
        this.armor = armor;
    }

    public void useArmor() {
        HP += armor.getDefencePoint();
    }
}
