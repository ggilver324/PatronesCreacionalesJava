package protoType;

public class Mage extends Enemy {

    private int mana;

    public Mage(int health, int damage, int mana) {
        super(health, damage);
        this.mana = mana;
    }

    public Mage(Mage mage) {
        super(mage);
        if(mage != null)
            setMana(mage.getMana());
    }

    @Override
    public Enemy Clone() {
        return new Mage(this);
    }

    public int getMana() {
        return mana;
    }

    public Mage setMana(int mana) {
        this.mana = mana;
        return this;
    }

    @Override
    public String toString() {
        return "Mage{" +
                "mana=" + mana +
                ", health=" + health +
                ", damage=" + damage +
                '}';
    }

}
