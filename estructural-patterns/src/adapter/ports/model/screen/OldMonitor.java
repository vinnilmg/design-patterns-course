package adapter.ports.model.screen;

import adapter.ports.interfaces.VGA;

public class OldMonitor implements VGA {
    @Override
    public void setImage(final String image) {
        System.out.println(">>> Video: " + image);
    }
}
