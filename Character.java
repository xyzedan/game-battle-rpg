public class Character {
    protected int HP, MP, level;
    protected String race;
    protected Weapon weapon;

    public Character(String race, int level) {
        int HPMPPerLevel = 10;
        this.race = race;
        this.level = level;
        this.HP = HPMPPerLevel * level;
        this.MP = HPMPPerLevel * level;
    }

    public int getHP() {
        return HP;
    }

    public int getMP() {
        return MP;
    }
    
    public int getLevel() {
        return level;
    }

    public String getRace() {
        return race;
    }
    
    public void setHP(int HP) {
        this.HP = HP;
    }
    
    public void setMP(int MP) {
        this.MP = MP;
    }
    
    public void setLevel(int level) {
        this.level = level;
    }
    
    public void setRace(String race) {
        this.race = race;
    }

    public void useWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public void useItem(Item item) {
        switch (item.getType().toLowerCase()) {
            case "potion":
                HP += item.getEffectValue();
                break;
            case "ether":
                MP += item.getEffectValue();
                break;
            case "elixir":
                HP += item.getEffectValue();
                MP += item.getEffectValue();
                break;
            default:
                break;
        }
    }

    protected int totalDamage() {
        return weapon.getAttackPoint();
    }
}
