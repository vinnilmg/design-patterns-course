package abstractfactory.apple.factory;

import abstractfactory.apple.model.certificate.Certificate;
import abstractfactory.apple.model.packing.Packing;

public abstract class CountryRulesAbstractFactory {

    public abstract Certificate getCertificate();

    public abstract Packing getPacking();
}
