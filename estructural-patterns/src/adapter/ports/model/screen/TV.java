package adapter.ports.model.screen;

import adapter.ports.interfaces.HDMI;

public class TV implements HDMI {
    @Override
    public void setImage(final String image) {
        System.out.println(">>> Video: " + image);
    }

    @Override
    public void setSound(final String sound) {
        System.out.println(">>> Sound: " + sound);
    }
}
