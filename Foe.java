public abstract class Foe extends Character{
    public Foe(String race, int level) {
        super(race, level);
    }

    @Override
    public void doAttack(Character target) {
        if (this.getStatus().isSleep()) {
            System.out.println("Foe sedang tidur, tidak dapat menyerang.");
        } else {
            target.setHP(target.getHP() - 10); // belum pake totalDamage() karna belum tentuin wp masing masing foe
        }
    }

    @Override
    public void doSkill(Character target) {
        if (this.getStatus().isSleep()) {
            System.out.println("Foe sedang tidur, tidak dapat menggunakan skill.");
        } else {
            int skillMP = 20;
            if (this.getMP() < skillMP) {
                System.out.println("Foe tidak cukup MP.");
            } else {
                this.setMP(this.getMP() - skillMP);
                int skillDamage = 20;
                target.takeDamage(skillDamage);
            }
        }
    }

    @Override
    public boolean isHero() {
        return false;
    }

    public abstract boolean validWeapon(Weapon weapon);
}

class Dragon extends Foe {
    public Dragon(String race, int level) {
        super(race, level);
    }

    @Override
    public boolean validWeapon(Weapon weapon) {
        // TODO
        throw new UnsupportedOperationException("Unimplemented method 'validWeapon'");
    }
}
class Dwarf extends Foe {
    public Dwarf(String race, int level) {
        super(race, level);
    }

    @Override
    public boolean validWeapon(Weapon weapon) {
        // TODO
        throw new UnsupportedOperationException("Unimplemented method 'validWeapon'");
    }
}
class Elf extends Foe {
    public Elf(String race, int level) {
        super(race, level);
    }

    public void heal(Character target) {
        int healAmount = 20;
        target.heal(healAmount);
    }

    @Override
    public boolean validWeapon(Weapon weapon) {
        // TODO
        throw new UnsupportedOperationException("Unimplemented method 'validWeapon'");
    }
}
class Goblin extends Foe {
    public Goblin(String race, int level) {
        super(race, level);
    }

    @Override
    public boolean validWeapon(Weapon weapon) {
        // TODO
        throw new UnsupportedOperationException("Unimplemented method 'validWeapon'");
    }
}
class Orc extends Foe {
    public Orc(String race, int level) {
        super(race, level);
    }

    @Override
    public boolean validWeapon(Weapon weapon) {
        // TODO
        throw new UnsupportedOperationException("Unimplemented method 'validWeapon'");
    }
}
class Skeleton extends Foe {
    public Skeleton(String race, int level) {
        super(race, level);
    }

    @Override
    public boolean validWeapon(Weapon weapon) {
        // TODO
        throw new UnsupportedOperationException("Unimplemented method 'validWeapon'");
    }
}
