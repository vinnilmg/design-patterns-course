package abstractfactory.apple;

import abstractfactory.apple.factory.BrazilianCountryRulesAbstractFactory;
import abstractfactory.apple.factory.ChinaCountryRulesAbstractFactory;
import abstractfactory.apple.factory.USCountryRulesAbstractFactory;
import abstractfactory.apple.model.iphone.Iphone11;
import abstractfactory.apple.model.iphone.IphoneX;

public class Client {
    public static void main(String[] args) {
        final var usRulesFactory = new USCountryRulesAbstractFactory();
        final var brazilianRulesFactory = new BrazilianCountryRulesAbstractFactory();
        final var chinaRulesFactory = new ChinaCountryRulesAbstractFactory();

        System.out.println("Criando um Iphone X - US");
        final var iphoneXFromUS = new IphoneX(usRulesFactory);
        iphoneXFromUS.getHardware();
        iphoneXFromUS.assemble();
        iphoneXFromUS.certificates();
        iphoneXFromUS.pack();

        System.out.println("\n\nCriando um Iphone X - Brazil");
        final var iphoneXFromBrazil = new IphoneX(brazilianRulesFactory);
        iphoneXFromBrazil.getHardware();
        iphoneXFromBrazil.assemble();
        iphoneXFromBrazil.certificates();
        iphoneXFromBrazil.pack();

        System.out.println("\n\nCriando um Iphone 11 - US");
        final var iphone11FromUS = new Iphone11(usRulesFactory);
        iphone11FromUS.getHardware();
        iphone11FromUS.assemble();
        iphone11FromUS.certificates();
        iphone11FromUS.pack();

        System.out.println("\n\nCriando um Iphone 11 - Brazil");
        final var iphone11FromBrazil = new Iphone11(brazilianRulesFactory);
        iphone11FromBrazil.getHardware();
        iphone11FromBrazil.assemble();
        iphone11FromBrazil.certificates();
        iphone11FromBrazil.pack();

        System.out.println("\n\nCriando um Iphone 11 - China");
        final var iphone11FromChina = new Iphone11(chinaRulesFactory);
        iphone11FromChina.getHardware();
        iphone11FromChina.assemble();
        iphone11FromChina.certificates();
        iphone11FromChina.pack();
    }
}
