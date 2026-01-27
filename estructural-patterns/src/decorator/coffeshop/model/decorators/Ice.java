package decorator.coffeshop.model.decorators;

import decorator.coffeshop.model.Drink;

public class Ice extends DrinkDecorator {
    public Ice(final Drink drink) {
        super(drink);
    }

    @Override
    public void serve() {
        drink.serve();
        System.out.println("- Adding 2 ices");
    }

    @Override
    public Double getPrice() {
        return drink.getPrice() + 0.2d;
    }
}
