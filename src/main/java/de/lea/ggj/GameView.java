package de.lea.ggj;

public class GameView {
    private static final int WIDTH = 32;
    private static final int HEIGHT = 32;
    private final Renderable[][] renderables = new Renderable[WIDTH][HEIGHT];

    private static final GameView GAME_VIEW = new GameView();

    private static GameView get() {
        return GAME_VIEW;
    }

    private GameView() {
    }
}
