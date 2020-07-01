package data;

import org.lwjgl.opengl.Display;
import org.newdawn.slick.opengl.Texture;

import static helpers.Artist.*;

public class Boot {
    public Boot() {
        beginSession();
        Texture t = quickLoad("Dirt Texture");
        Texture t2 = quickLoad("Grass Texture");
        while (!Display.isCloseRequested()) {
            drawQuadTex(t, 0, 0, 64, 64);
            drawQuadTex(t2, 64, 0, 64, 64);
            Display.update();
            Display.sync(60);
        }
        Display.destroy();
    }

    public static void main(String[] args) {
        new Boot();
    }
}
