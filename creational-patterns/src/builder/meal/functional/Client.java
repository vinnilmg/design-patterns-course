package builder.meal.functional;

import builder.meal.functional.model.FastFoodMeal;

public class Client {
    public static void orderBurguerCombo() {
        final var combo = new FastFoodMeal.Builder("Fries")
                .andMain("Cheese Burguer")
                .forDrink("Coke")
                .thatsAll();

        System.out.println("Burguer: " + combo);
    }

    public static void orderJustFriesCombo() {
        final var combo = new FastFoodMeal.Builder("Large Fries")
                .thatsAll();

        System.out.println("Just Fries: " + combo);
    }

    public static void heartAttackCombo() {
        final var combo = new FastFoodMeal.Builder("Large Fries")
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
