package data;

public enum TileType {
    Grass("Grass Texture", true), Dirt("Dirt Texture", false);
    String textureName;
    boolean buildable;

    TileType(String textureName, boolean buildable) {
        this.textureName = textureName;
        this.buildable = buildable;
    }
}
