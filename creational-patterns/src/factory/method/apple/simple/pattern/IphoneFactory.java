package factory.method.apple.simple.pattern;

import factory.method.apple.simple.model.IPhone;

public class IphoneFactory {

    public IPhone orderIphone(String generation, String level) {
        final var device = createIphone(generation, level);
        device.getHardware();
        device.assemble();
        device.certificates();
        device.pack();
        return device;
    }

    protected abstract IPhone createIphone(String generation, String level);
}
