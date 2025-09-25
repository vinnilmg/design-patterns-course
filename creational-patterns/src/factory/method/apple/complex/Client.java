package factory.method.apple.complex;

import factory.method.apple.complex.pattern.impl.Iphone11ProFactory;
import factory.method.apple.complex.pattern.impl.IphoneXFactory;

public class Client {

    public static void main(String[] args) {
        System.out.println("### Ordering an iPhone X");
        final var iphoneXFactory = new IphoneXFactory();
        final var iphoneX = iphoneXFactory.orderIphone();
        System.out.println(iphoneX);

        System.out.println("\n\n### Ordering an iPhone 11 HighEnd");
        final var iphone11ProFactory = new Iphone11ProFactory();
        final var iphone2 = iphone11ProFactory.orderIphone();
        System.out.println(iphone2);
    }
}
