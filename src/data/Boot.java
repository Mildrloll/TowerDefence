package data;

import org.lwjgl.opengl.Display;

import static helpers.Artist.beginSession;
import static helpers.Artist.drawQuad;

public class Boot {
    public Boot() {
        beginSession();
        while (!Display.isCloseRequested()) {
            drawQuad(50, 50, 100, 100);
            drawQuad(150, 150, 100, 100);
            Display.update();
            Display.sync(60);
        }
        Display.destroy();
    }

    public static void main(String[] args) {
        new Boot();
    }
}
