package adapter.ports.model;

import adapter.ports.interfaces.HDMI;

import static java.util.Objects.nonNull;

public class Computer {
    private HDMI port;

    public void connectPort(final HDMI screen) {
        System.out.println("Connection on HDMI port...");
        this.port = screen;
    }

    public void sendImageAndSound(final String image, final String sound) {
        if (nonNull(port)) {
            port.setImage(image);
            port.setSound(sound);
        } else {
            System.out.println("Connect a HDMI cable first.");
        }
    }
}
