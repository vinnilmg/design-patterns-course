package factory.method.apple.halfSimple.pattern.impl;

import factory.method.apple.halfSimple.model.IPhone;
import factory.method.apple.halfSimple.model.IPhone11;
import factory.method.apple.halfSimple.model.IPhone11Pro;
import factory.method.apple.halfSimple.pattern.IphoneFactory;

public class Iphone11Factory extends IphoneFactory {
    @Override
    public IPhone createIphone(final String level) {
        return switch (level) {
            case "highend" -> new IPhone11Pro();
            case "standard" -> new IPhone11();
            default -> null;
        };
    }
}
