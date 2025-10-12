package factory.method.apple.halfSimple.pattern;

import factory.method.apple.halfSimple.model.IPhone;

public abstract class IphoneFactory {

    public IPhone orderIphone(final String level) {
        final var device = createIphone(level);

        device.getHardware();
        device.assemble();
        device.certificates();
        device.pack();

        return device;
    }

    protected abstract IPhone createIphone(String level);
}
