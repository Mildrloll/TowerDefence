package helpers;

import org.lwjgl.LWJGLException;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;

import static org.lwjgl.opengl.GL11.*;
import static org.lwjgl.opengl.GL11.GL_MODELVIEW;

public class Artist {
    public static final int WIDTH = 600, HEIGHT = 400;

    public static void beginSession() {
        Display.setTitle("Tower Defence");
        try {
            Display.setDisplayMode(new DisplayMode(600, 400));
            Display.create();
        } catch (LWJGLException e) {
            e.printStackTrace();
        }
        glMatrixMode(GL_PROJECTION);
        glLoadIdentity();
        glOrtho(0, 600, 400, 0, 1, -1);
        glMatrixMode(GL_MODELVIEW);
    }

    public static void drawQuad(float x, float y, float width, float height) {
        glBegin(GL_QUADS);
        glVertex2f(x, y); //Top left corner
        glVertex2f(x + width, y); //Top right corner
        glVertex2f(x + width, y + height); //Bottom right corner
        glVertex2f(x, y + height); //Bottom Left corner
        glEnd();
    }
}
