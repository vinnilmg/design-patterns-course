package factory.method.apple.simple;

import factory.method.apple.simple.pattern.IphoneSimpleFactory;

public class Client {

    public static void main(String[] args) {
        final var factory = new IphoneSimpleFactory();

        System.out.println("### Ordering an iPhone X");
        final var iphoneX = factory.orderIphone("X", "standard");
        System.out.println(iphoneX);

        System.out.println("\n\n### Ordering an iPhone 11 HighEnd");
        final var iphone11 = factory.orderIphone("11", "highend");
        System.out.println(iphone11);
    }
}
