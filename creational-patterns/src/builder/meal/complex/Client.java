package builder.meal.complex;

import builder.meal.complex.pattern.builder.BurguerComboBuilder;
import builder.meal.complex.pattern.builder.FastFoodMealBuilder;
import builder.meal.complex.pattern.builder.HeartAttackBuilder;
import builder.meal.complex.pattern.builder.JustFriesBuilder;
import builder.meal.complex.pattern.director.MealDirector;

public class Client {

    public static void order(final String comboName, final FastFoodMealBuilder builder) {
        System.out.println("### Ordering a combo: " + comboName);

        final var director = new MealDirector(builder);
        director.constructCombo();
        System.out.println(director.getCombo());

        System.out.println("------------------------------------------");
    }

    public static void main(String[] args) {
        order("Burguer", new BurguerComboBuilder());
        order("Just Fries", new JustFriesBuilder());
        order("Heart Attack", new HeartAttackBuilder());
    }
}
