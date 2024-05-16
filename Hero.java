public abstract class Hero extends Character {
    protected String name;
    protected Armor armor;

    protected Hero(String name, String race, int level) {
        super(race, level);
        this.name = name;
        this.race = race;
    }

    public void setArmor(Armor armor) {
        this.armor = armor;
    }

    public void useArmor() {
        HP += armor.getDefencePoint();
    }

    @Override
    public void doAttack(Character target) {
        if (this.getStatus().isSleep()) {
            System.out.println(this.name + " sedang tidur, tidak dapat menyerang.");
        } else {
            target.setHP(target.getHP() - totalDamage());
        }
    }

    @Override
    public void doSkill(Character target) {
        if (this.getStatus().isSleep()) {
            System.out.println(this.name + " sedang tidur, tidak dapat menggunakan skill.");
        } else {
            int skillMP = 10;
            if (this.getMP() < skillMP) {
                System.out.println(this.name + " tidak cukup MP.");
            } else {
                this.setMP(this.getMP() - skillMP);
                int skillDamage = 30;
                target.takeDamage(skillDamage);
            }
        }
    }

    @Override
    public boolean isHero() {
        return true;
    }

    public abstract boolean validWeapon(Weapon weapon);
}

class Archer extends Hero {

    public Archer(String name, String race, int level) {
        super(name, race, level);
    }

    @Override
    public boolean validWeapon(Weapon weapon) {
        return weapon instanceof Arrow;
    }
}
class Fairy extends Hero {

    public Fairy(String name, String race, int level) {
        super(name, race, level);
    }

    @Override
    public boolean validWeapon(Weapon weapon) {
        return weapon instanceof MagicWand;
    }
}
class Fighter extends Hero {

    public Fighter(String name, String race, int level) {
        super(name, race, level);
    }

    @Override
    public boolean validWeapon(Weapon weapon) {
        return weapon instanceof Glove;
    }
}
class Knight extends Hero {

    public Knight(String name, String race, int level) {
        super(name, race, level);
    }

    @Override
    public boolean validWeapon(Weapon weapon) {
        return weapon instanceof Sword;
    }
}
