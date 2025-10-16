package abstractfactory.apple.factory;

import abstractfactory.apple.model.certificate.BrazilianCertificate;
import abstractfactory.apple.model.certificate.Certificate;
import abstractfactory.apple.model.packing.BrazilianPacking;
import abstractfactory.apple.model.packing.Packing;

public class BrazilianCountryRulesAbstractFactory extends CountryRulesAbstractFactory {
    @Override
    public Certificate getCertificate() {
        return new BrazilianCertificate();
    }

    @Override
    public Packing getPacking() {
        return new BrazilianPacking();
    }
}
