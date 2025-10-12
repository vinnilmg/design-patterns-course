package factory.method.apple.halfSimple.pattern.impl;

import factory.method.apple.halfSimple.model.IPhone;
import factory.method.apple.halfSimple.model.IPhoneX;
import factory.method.apple.halfSimple.model.IPhoneXSMax;
import factory.method.apple.halfSimple.pattern.IphoneFactory;

public class IphoneXFactory extends IphoneFactory {

    @Override
    public IPhone createIphone(final String level) {
        return switch (level) {
            case "highend" -> new IPhoneXSMax();
            case "standard" -> new IPhoneX();
            default -> null;
        };
    }
}
