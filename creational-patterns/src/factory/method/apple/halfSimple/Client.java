package factory.method.apple.halfSimple;

import factory.method.apple.halfSimple.pattern.impl.Iphone11Factory;
import factory.method.apple.halfSimple.pattern.impl.IphoneXFactory;

public class Client {

    public static void main(String[] args) {
        System.out.println("### Ordering an iPhone X");
        final var iphoneXFactory = new IphoneXFactory();
        final var iphoneX = iphoneXFactory.orderIphone("standard");
        System.out.println(iphoneX);

        System.out.println("\n\n### Ordering an iPhone 11 HighEnd");
        final var iphone11ProFactory = new Iphone11Factory();
        final var iphone11 = iphone11ProFactory.orderIphone("highend");
        System.out.println(iphone11);
    }
}
