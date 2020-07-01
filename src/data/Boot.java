package data;

import org.lwjgl.opengl.Display;

import static helpers.Artist.beginSession;

public class Boot {
    public Boot() {
        beginSession();
        Tile tile = new Tile(0, 0, 64, 64, TileType.Grass);
        Tile tile2 = new Tile(0, 64, 64, 64, TileType.Dirt);
        while (!Display.isCloseRequested()) {
            tile.draw();
            tile2.draw();
            Display.update();
            Display.sync(60);
        }
        Display.destroy();
    }

    public static void main(String[] args) {
        new Boot();
    }
}
