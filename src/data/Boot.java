package data;

import org.lwjgl.opengl.Display;
import org.newdawn.slick.opengl.Texture;

import static helpers.Artist.*;

public class Boot {
    public Boot() {
        beginSession();
        Tile tile = new Tile(0, 0, 64, 64, TileType.Grass);
        Tile tile2 = new Tile(0, 64, 64, 64, TileType.Dirt);
        while (!Display.isCloseRequested()) {
            drawQuadTex(tile.getTexture(), tile.getX(), tile.getY(), tile.getWidth(), tile.getHeight());
            drawQuadTex(tile2.getTexture(), tile2.getX(), tile2.getY(), tile2.getWidth(), tile2.getHeight());
            Display.update();
            Display.sync(60);
        }
        Display.destroy();
    }

    public static void main(String[] args) {
        new Boot();
    }
}
