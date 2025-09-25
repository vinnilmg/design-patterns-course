package factory.method.apple.complex.pattern.impl;

import factory.method.apple.complex.model.IPhone;
import factory.method.apple.complex.model.IPhoneXSMax;
import factory.method.apple.complex.pattern.IphoneFactory;

public class IphoneXSMaxFactory extends IphoneFactory {

    @Override
    public IPhone createIphone() {
        return new IPhoneXSMax();
    }
}
