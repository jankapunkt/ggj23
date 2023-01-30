package de.lea.ggj;

import javax.lang.model.type.PrimitiveType;
import java.util.HashMap;
import java.util.Map;

public class GameWorld {
    private final GameObject[][] world;
    private final Map<String, PrimitiveType> stats = new HashMap<>();

    private static final GameWorld GAME_WORLD = new GameWorld(80, 24);

    private GameWorld(int width, int height) {
        if (width <= 0 || height <= 0) {
            throw new IllegalArgumentException("Game area must not be zero in any dimension");
        }
        world = new GameObject[width][height];
    }

    public static GameWorld get() {
        return GAME_WORLD;
    }
}
