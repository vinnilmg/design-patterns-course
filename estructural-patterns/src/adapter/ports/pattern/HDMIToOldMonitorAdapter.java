package adapter.ports.pattern;

import adapter.ports.interfaces.HDMI;
import adapter.ports.model.screen.OldMonitor;

public class HDMIToOldMonitorAdapter extends OldMonitor implements HDMI {

    public HDMIToOldMonitorAdapter() {
        super();
        System.out.println("Wrapping the Old Monitor");
    }

    @Override
    public void setSound(final String sound) {
        System.out.println("We dont work with sound");
    }
}
