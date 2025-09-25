package factory.method.apple.simple;

import factory.method.apple.simple.model.IPhone;
import factory.method.apple.simple.pattern.IphoneFactory;

public class Client {

    public static void main(String[] args) {
        final var factory = new IphoneFactory();

        System.out.println("### Ordering an iPhone X");
        IPhone iphone = factory.orderIPhone("X", "standard");
        System.out.println(iphone);

        System.out.println("\n\n### Ordering an iPhone 11 HighEnd");
        IPhone iphone2 = factory.orderIPhone("11", "highEnd");
        System.out.println(iphone2);
    }
}
