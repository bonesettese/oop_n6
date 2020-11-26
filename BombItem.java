package uet.oop.bomberman.entities;

import javafx.scene.image.Image;
import uet.oop.bomberman.BombermanGame;

import java.awt.*;

public class BombItem extends Item {
    public BombItem(int xUnit, int yUnit, Image img) {
        super(xUnit, yUnit, img);
        alive = true;
    }

    @Override
    public void update() {
        if (!this.isAlive()) {
            Rectangle bomber = BombermanGame.myBomber.getBounds();
            Rectangle item = this.getBounds();
            if (bomber.intersects(item)) {
                BombermanGame.myBomber.setBombRemain(BombermanGame.myBomber.getBombRemain() + 1);
                BombermanGame.stillObjects.remove(this);
            }
        }
    }
}
