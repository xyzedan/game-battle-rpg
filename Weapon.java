public class Weapon {
    protected int attackPoint;

    public Weapon(int attackPoint) {
        this.attackPoint = attackPoint;
    }

    public int getAttackPoint() {
        return attackPoint;
    }

    public void setAttackPoint(int attackPoint) {
        this.attackPoint = attackPoint;
    }

    public void attack() {}
}


class Sword extends Weapon {
    public Sword(int attackPoint) {
        super(attackPoint);
    }
}

class Arrow extends Weapon {
    public Arrow(int attackPoint) {
        super(attackPoint);
    }
}

class Glove extends Weapon {
    public Glove(int attackPoint) {
        super(attackPoint);
    }
}

class MagicWand extends Weapon {
    public MagicWand(int attackPoint) {
        super(attackPoint);
    }
}
