package adapter.ports.pattern;

import adapter.ports.interfaces.HDMI;
import adapter.ports.interfaces.VGA;

public class HDMIToVGAAdapter implements HDMI {
    private final VGA vga;

    public HDMIToVGAAdapter(final VGA vga) {
        System.out.println("Connecting to HDMI/VGA adapter...");
        this.vga = vga;
    }

    @Override
    public void setImage(final String image) {
        System.out.println("Converting the image from HDMI to VGA");
        vga.setImage(image);
    }

    @Override
    public void setSound(final String sound) {
        System.out.println("We dont work with sound");
    }
}
