package factory.method.apple.complex.pattern.impl;

import factory.method.apple.complex.model.IPhone;
import factory.method.apple.complex.model.IPhone11Pro;
import factory.method.apple.complex.pattern.IphoneFactory;

public class Iphone11ProFactory extends IphoneFactory {
    @Override
    public IPhone createIphone() {
        return new IPhone11Pro();
    }
}
