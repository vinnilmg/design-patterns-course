package abstractfactory.apple.factory;

import abstractfactory.apple.model.certificate.Certificate;
import abstractfactory.apple.model.certificate.USCertificate;
import abstractfactory.apple.model.packing.Packing;
import abstractfactory.apple.model.packing.USPacking;

public class USCountryRulesAbstractFactory extends CountryRulesAbstractFactory {
    @Override
    public Certificate getCertificate() {
        return new USCertificate();
    }

    @Override
    public Packing getPacking() {
        return new USPacking();
    }
}
