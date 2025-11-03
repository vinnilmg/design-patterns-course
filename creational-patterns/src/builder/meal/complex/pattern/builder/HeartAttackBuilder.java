package builder.meal.complex.pattern.builder;

public class HeartAttackBuilder extends FastFoodMealBuilder {
    @Override
    public void buildDrink() {
        meal.setDrink("Milk Shake");
    }

    @Override
    public void buildMain() {
        meal.setMain("Monster Burguer");
    }

    @Override
    public void buildSide() {
        meal.setSide("Large Fries");
    }

    @Override
    public void buildDessert() {
        meal.setDessert("Fudge Cake");
    }

    @Override
    public void buildGift() {
        meal.setGift("2 Kilograms");
    }
}
