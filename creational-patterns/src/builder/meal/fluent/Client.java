package builder.meal.fluent;

import builder.meal.fluent.pattern.FastFoodMealBuilder;

public class Client {

    public static void orderBurguerCombo() {
        final var combo = new FastFoodMealBuilder("Fries")
                .andMain("Cheese Burguer")
                .forDrink("Coke")
                .thatsAll();

        System.out.println("Burguer: " + combo);
    }

    public static void orderJustFriesCombo() {
        final var combo = new FastFoodMealBuilder("Large Fries")
                .thatsAll();

        System.out.println("Just Fries: " + combo);
    }

    public static void heartAttackCombo() {
        final var combo = new FastFoodMealBuilder("Large Fries")
                .andMain("Monster Burguer")
                .forDrink("Milk Shake")
                .andDessert("Fudge Cake")
                .andGift("2 Kilograms")
                .thatsAll();

        System.out.println("Heart Attack: " + combo);
    }

    public static void main(String[] args) {
        orderBurguerCombo();
        orderJustFriesCombo();
        heartAttackCombo();
    }
}
