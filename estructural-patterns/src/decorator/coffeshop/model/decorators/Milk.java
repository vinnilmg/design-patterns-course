package decorator.coffeshop.model.decorators;

import decorator.coffeshop.model.Drink;

public class Milk extends DrinkDecorator {

    public Milk(final Drink drink) {
        super(drink);
    }

    @Override
    public void serve() {
        drink.serve();
        System.out.println("- Adding 30ml of milk");
    }

    @Override
    public Double getPrice() {
        return drink.getPrice() + 0.5d;
    }
}
