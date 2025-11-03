package builder.meal.fluent.pattern;

import builder.meal.fluent.model.FastFoodMeal;

public class FastFoodMealBuilder {
    // Obrigatorios
    private final String side;

    // Opcionais
    private String drink;
    private String main;
    private String dessert;
    private String gift;

    public FastFoodMealBuilder(final String side) {
        this.side = side;
    }

    public FastFoodMealBuilder andMain(final String main) {
       this.main = main;
        return this;
    }

    public FastFoodMealBuilder andDessert(final String dessert) {
        this.dessert = dessert;
        return this;
    }

    public FastFoodMealBuilder andGift(final String gift) {
        this.gift = gift;
        return this;
    }

    public FastFoodMealBuilder forDrink(final String drink) {
        this.drink = drink;
        return this;
    }

    public FastFoodMeal thatsAll() {
        return new FastFoodMeal(
                drink,
                main,
                side,
                dessert,
                gift
        );
    }
}
