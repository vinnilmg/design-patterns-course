package decorator.coffeshop.model.decorators;

import decorator.coffeshop.model.Drink;

public abstract class DrinkDecorator implements Drink {
    protected Drink drink;

    public DrinkDecorator(final Drink drink) {
        this.drink = drink;
    }
}
