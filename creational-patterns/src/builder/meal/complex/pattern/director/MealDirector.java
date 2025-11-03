package builder.meal.complex.pattern.director;

import builder.meal.complex.model.FastFoodMeal;
import builder.meal.complex.pattern.builder.FastFoodMealBuilder;

public class MealDirector {
    private final FastFoodMealBuilder builder;

    public MealDirector(final FastFoodMealBuilder builder) {
        this.builder = builder;
    }

    public void constructCombo() {
        builder.buildDrink();
        builder.buildMain();
        builder.buildSide();
        builder.buildDessert();
        builder.buildGift();
    }

    public FastFoodMeal getCombo() {
        return builder.getMeal();
    }
}
