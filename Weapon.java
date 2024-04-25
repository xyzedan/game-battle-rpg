public class Weapon {
    protected int attackPoint;
    protected String type;

    public Weapon(int attackPoint, String type) {
        this.attackPoint = attackPoint;
        this.type = type;
    }

    public int getAttackPoint() {
        return attackPoint;
    }

    public String getType() {
        return type;
    }

    public void setAttackPoint(int attackPoint) {
        this.attackPoint = attackPoint;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void attack() {}
}
