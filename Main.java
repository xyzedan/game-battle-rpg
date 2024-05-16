public class Main {
    public static void main(String[] args) {
        // Upcasting
        Character hero = new Knight("Arthur", "Knight", 1);
        Character foe = new Elf("Elf", 1);
        Weapon wp = new Sword(10);
        hero.useWeapon(wp);

        hero.info();
        foe.info();

        hero.doAttack(foe);
        foe.doAttack(hero);

        hero.info();
        foe.info();
        
        if (foe instanceof Elf) {
            Elf foe2 = (Elf) foe;
            foe2.heal(hero);
        }
        
        hero.info();
        foe.info();

        Item potion = new Item(25, "Potion");
        hero.useItem(potion);
        hero.info();
    }
}
