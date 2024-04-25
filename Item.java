public class Item {
    protected int effectValue;
    protected String type;

    public Item(int effectValue, String type) {
        this.effectValue = effectValue;
        this.type = type;
    }

    public int getEffectValue() {
        return effectValue;
    }
    
    public String getType() {
        return type;
    }

    public void setEffectValue(int effectValue) {
        this.effectValue = effectValue;
    }
    
    public void setType(String type) {
        this.type = type;
    }
}
