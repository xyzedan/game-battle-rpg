public abstract class Character {
    protected int HP, MP, level;
    protected String race;
    protected Weapon weapon;
    protected Status status;

    public Character(String race, int level) {
        int HPMPPerLevel = 10;
        this.race = race;
        this.level = level;
        this.HP = HPMPPerLevel * level;
        this.MP = HPMPPerLevel * level;
        this.status = new Status();
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

    public Status getStatus() {
        return status;
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
        if (validWeapon(weapon)) {
            this.weapon = weapon;
        } else {
            System.out.println( "Invalid weapon" );
        }
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

    public abstract void doAttack(Character target);

    public abstract void doSkill(Character target);

    public abstract boolean isHero();

    public abstract boolean validWeapon(Weapon weapon);

    public void takeDamage(int damage) {
        if (status.isWeak()) {
            damage *= 2;
        }
        HP -= damage;
    }

    public void heal(int heal) {
        HP += heal;
    }

    public void recover(int recover) {
        MP += recover;
    }

    public void info() {
        System.out.println("Race: " + getRace() + "\nLevel: " + getLevel() + "\nHP: " + getHP() + "\nMP: " + getMP() + "\nStatus: " + getStatus().showStatus() + "\n");
    }

    protected int totalDamage() {
        return weapon.getAttackPoint();
    }
}
