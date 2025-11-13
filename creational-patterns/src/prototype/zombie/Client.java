package prototype.zombie;

import prototype.zombie.model.Monster;

public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        final var goblinWeak = createGoblinWeak();
        displayMonsterAttack(goblinWeak);

        System.out.println("--------------------------------------------------------------------------------");

        // O Prototype é aplicado aqui
        final var goblinStrong = createGoblinStrong(goblinWeak);
        displayMonsterAttack(goblinStrong);
    }

    private static Monster createGoblinWeak() {
        return new Monster("Goblin Simples", "Mãos", "10", "Goblin", 100);
    }

    public static Monster createGoblinStrong(final Monster goblinPrototype) throws CloneNotSupportedException {
        final var goblinStrong = goblinPrototype.clone();
        goblinStrong.setName("Goblin Armado");
        goblinStrong.setWeapon("Cutelo");
        goblinStrong.setDamage("20");
        return goblinStrong;
    }

    public static void displayMonsterAttack(final Monster monster) {
        System.out.println(monster);
        monster.attack();
    }
}
