public class Status {
    boolean isPoisoned, isSleep, isWeak;
    private int poisonDemage, poisonDuration;

    public Status() {
        this.isPoisoned = false;
        this.isSleep = false;
        this.isWeak = false;
        this.poisonDemage = 0;
        this.poisonDuration = 0;
    }

    public boolean isPoisoned() {
        return isPoisoned;
    }

    public void setPoisoned(boolean poisoned, int poisonDemage, int poisonDuration) {
        isPoisoned = poisoned;
        this.poisonDemage = poisonDemage;
        this.poisonDuration = poisonDuration;
    }

    public boolean isSleep() {
        return isSleep;
    }

    public void setSleep(boolean sleep) {
        isSleep = sleep;
    }

    public boolean isWeak() {
        return isWeak;
    }

    public void setWeak(boolean weak) {
        isWeak = weak;
    }

    public int getPoisonDemage() {
        return poisonDemage;
    }

    public int getPoisonDuration() {
        return poisonDuration;
    }

    public void reducePoisonDuration() {
        poisonDuration--;
    }

    public void clearStatus() {
        isPoisoned = false;
        isSleep = false;
        isWeak = false;
        poisonDemage = 0;
        poisonDuration = 0;
    }

    public void clearPoison() {
        isPoisoned = false;
        poisonDemage = 0;
        poisonDuration = 0;
    }

    public String showStatus() {
        return "Poisoned: " + isPoisoned + ", Sleep: " + isSleep + ", Weak: " + isWeak + ", Poison demage: " + poisonDemage + ", Poison duration: " + poisonDuration;
    }
}
