package builder.meal.complex.pattern.builder;

public class BurguerComboBuilder extends FastFoodMealBuilder {
    @Override
    public void buildDrink() {
        meal.setDrink("Coke");
    }

    @Override
    public void buildMain() {
        meal.setMain("Cheese Burguer");
    }

    @Override
    public void buildSide() {
        meal.setSide("Fries");
    }

    @Override
    public void buildDessert() {
        // no dessert
    }

    @Override
    public void buildGift() {
        // no gift
    }
}
