package factory.method.apple.simple.pattern;

import factory.method.apple.simple.model.IPhone;
import factory.method.apple.simple.model.IPhone11;
import factory.method.apple.simple.model.IPhone11Pro;
import factory.method.apple.simple.model.IPhoneX;
import factory.method.apple.simple.model.IPhoneXSMax;

import static java.util.Objects.nonNull;

public class IphoneSimpleFactory {

    public static IPhone orderIphone(final String generation, final String level) {
        final var device = createIphone(generation, level);

        if (nonNull(device)) {
            device.getHardware();
            device.assemble();
            device.certificates();
            device.pack();
        }

        return device;
    }

    private static IPhone createIphone(final String generation, final String level) {
        return switch (generation) {
            case "X" -> {
                if (level.equals("standard")) {
                    yield new IPhoneX();

                } else if (level.equals("highend")) {
                    yield new IPhoneXSMax();

                } else {
                    yield null;
                }
            }
            case "11" -> {
                if (level.equals("standard")) {
                    yield new IPhone11();

                } else if (level.equals("highend")) {
                    yield new IPhone11Pro();

                } else {
                    yield null;
                }
            }
            default -> null;
        };
    }
}
