package abstractfactory.apple.factory;

import abstractfactory.apple.model.certificate.Certificate;
import abstractfactory.apple.model.certificate.ChinaCertificate;
import abstractfactory.apple.model.packing.ChinaPacking;
import abstractfactory.apple.model.packing.Packing;

public class ChinaCountryRulesAbstractFactory extends CountryRulesAbstractFactory {
    @Override
    public Certificate getCertificate() {
        return new ChinaCertificate();
    }

    @Override
    public Packing getPacking() {
        return new ChinaPacking();
    }
}
