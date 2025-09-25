package factory.method.apple.complex.pattern.impl;

import factory.method.apple.complex.model.IPhone;
import factory.method.apple.complex.model.IPhone11;
import factory.method.apple.complex.pattern.IphoneFactory;

public class Iphone11Factory extends IphoneFactory {
    @Override
    public IPhone createIphone() {
        return new IPhone11();
    }
}
