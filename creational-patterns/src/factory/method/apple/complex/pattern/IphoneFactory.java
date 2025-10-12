package factory.method.apple.complex.pattern;

import factory.method.apple.complex.model.IPhone;

public abstract class IphoneFactory {

    public IPhone orderIphone() {
        final var device = createIphone();

        device.getHardware();
        device.assemble();
        device.certificates();
        device.pack();

        return device;
    }

    protected abstract IPhone createIphone();
}
