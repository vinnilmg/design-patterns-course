package adapter.ports;

import adapter.ports.interfaces.HDMI;
import adapter.ports.model.Computer;
import adapter.ports.model.screen.OldMonitor;
import adapter.ports.model.screen.TV;
import adapter.ports.pattern.HDMIToOldMonitorAdapter;
import adapter.ports.pattern.HDMIToVGAAdapter;

public class Client {
    private static final String IMAGE = "My Image";
    private static final String SOUND = "My Sound";

    public static void main(String[] args) {
        final var computer = new Computer();

        System.out.println("------------ TV ------------");
        sendImageAndSound(computer, new TV());

        // Abaixo são 2 tipos de implementação do Adapter
        System.out.println("------------ Old Monitor ------------");

        final var oldMonitor = new OldMonitor();
        sendImageAndSound(computer, new HDMIToVGAAdapter(oldMonitor));

        final var oldMonitorAdapted = new HDMIToOldMonitorAdapter();
        sendImageAndSound(computer, oldMonitorAdapted);
    }

    private static void sendImageAndSound(final Computer pc, final HDMI screen) {
        pc.connectPort(screen);
        pc.sendImageAndSound(IMAGE, SOUND);
        System.out.println();
    }
}
