package builder.meal.complex.pattern.builder;

import builder.meal.complex.model.FastFoodMeal;

public abstract class FastFoodMealBuilder {
    protected FastFoodMeal meal;

    protected FastFoodMealBuilder() {
        meal = new FastFoodMeal();
    }

    public FastFoodMeal getMeal() {
        return meal;
    }

    public abstract void buildDrink();
    public abstract void buildMain();
    public abstract void buildSide();
    public abstract void buildDessert();
    public abstract void buildGift();
}
