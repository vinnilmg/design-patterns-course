package prototype.zombie.model;

public class Monster implements Cloneable {
    private String name;
    private String weapon;
    private String damage;
    private String type;
    private int health;

    public Monster(
            final String name,
            final String weapon,
            final String damage,
            final String type,
            final int health
    ) {
        this.name = name;
        this.weapon = weapon;
        this.damage = damage;
        this.type = type;
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public String getDamage() {
        return damage;
    }

    public void setDamage(String damage) {
        this.damage = damage;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void attack() {
        System.out.println(this.name + " ataca com " + this.weapon + " e causa " + this.damage + " de dano!");
    }

    @Override
    public String toString() {
        return "Monster{" +
                "name='" + name + '\'' +
                ", weapon='" + weapon + '\'' +
                ", damage='" + damage + '\'' +
                ", type='" + type + '\'' +
                ", health=" + health +
                '}';
    }

    public Monster clone() throws CloneNotSupportedException {
        return (Monster) super.clone();
    }
}
