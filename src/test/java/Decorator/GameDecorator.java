package Decorator;

import Entities.Game;

public abstract class GameDecorator extends Game {

    protected Game MyGame;

    public GameDecorator(Game game) {
        MyGame = game;
    }

    public GameDecorator(String name, int price) {
        super(name, price);
    }

    @Override
    public void StartGame() {
        this.MyGame.StartGame();
    }
}
