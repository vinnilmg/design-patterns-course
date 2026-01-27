package decorator.coffeshop;

import decorator.coffeshop.model.Expresso;
import decorator.coffeshop.model.Tea;
import decorator.coffeshop.model.decorators.Ice;
import decorator.coffeshop.model.decorators.Milk;

public class Client {
    public static void main(String[] args) {

        System.out.println("Order 1 - Expresso + Milk");
        final var expresso = new Expresso();
        final var expressoWithMilk = new Milk(expresso);
        expressoWithMilk.serve();
        System.out.println("Total: " + expressoWithMilk.getPrice());

        System.out.println("*-----------------------------------------*");

        System.out.println("Order 2 - Tea + Milk + Ice");
        final var tea = new Tea();
        final var teaWithMilk = new Milk(tea);
        final var iceWithTeaWithMilk = new Ice(teaWithMilk);
        iceWithTeaWithMilk.serve();
        System.out.println("Total: " + iceWithTeaWithMilk.getPrice());
    }
}
