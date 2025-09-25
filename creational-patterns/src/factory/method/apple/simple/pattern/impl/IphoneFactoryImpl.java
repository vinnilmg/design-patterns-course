package factory.method.apple.simple.pattern.impl;

import factory.method.apple.simple.model.IPhone;
import factory.method.apple.simple.model.IPhone11;
import factory.method.apple.simple.model.IPhone11Pro;
import factory.method.apple.simple.model.IPhoneX;
import factory.method.apple.simple.model.IPhoneXSMax;
import factory.method.apple.simple.pattern.IphoneFactory;

public class IphoneFactoryImpl extends IphoneFactory {
    @Override
    public IPhone createIphone(String generation, String level) {
        IPhone device = null;

        if (generation.equals("X")) {
            if (level.equals("standard")) {
                device = new IPhoneX();
            } else if (level.equals("highEnd")) {
                device = new IPhoneXSMax();
            }
        } else if (generation.equals("11")) {
            if (level.equals("standard")) {
                device = new IPhone11();
            } else if (level.equals("highEnd")) {
                device = new IPhone11Pro();
            }
        }

        return device;
    }
}
