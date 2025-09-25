package factory.method.apple.complex.pattern.impl;

import factory.method.apple.complex.model.IPhone;
import factory.method.apple.complex.model.IPhoneX;
import factory.method.apple.complex.pattern.IphoneFactory;

public class IphoneXFactory extends IphoneFactory {

    @Override
    public IPhone createIphone() {
        return new IPhoneX();
    }
}
