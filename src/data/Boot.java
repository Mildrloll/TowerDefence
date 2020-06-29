package data;

import org.lwjgl.opengl.Display;

import static helpers.Artist.beginSession;
import static org.lwjgl.opengl.GL11.*;

public class Boot {
    public Boot() {
        beginSession();
        float width = 50;
        float height = 50;
        float x = 100;
        float y = 100;
        while (!Display.isCloseRequested()) {
            glBegin(GL_LINES);
            glVertex2f(10, 10);
            glVertex2f(100, 100);
            glEnd();
            glBegin(GL_QUADS);
            glVertex2f(x, y); //Top left corner
            glVertex2f(x + width, y); //Top right corner
            glVertex2f(x + width, y + height); //Bottom right corner
            glVertex2f(x, y + height); //Bottom Left corner
            glEnd();
            Display.update();
            Display.sync(60);
        }
        Display.destroy();
    }

    public static void main(String[] args) {
        new Boot();
    }
}
