package uet.oop.bomberman.entities;

import javafx.scene.image.Image;
import uet.oop.bomberman.BombermanGame;
import uet.oop.bomberman.graphics.Sprite;

import java.awt.*;

public class FlameItem extends Item {
    public FlameItem(int xUnit, int yUnit, Image img) {
        super(xUnit, yUnit, img);
        alive = true;
    }

    @Override
    public void update() {
        if (!this.isAlive()) {
            Rectangle bomber = BombermanGame.myBomber.getBounds();
            Rectangle item = this.getBounds();
            if (bomber.intersects(item)) {
                BombermanGame.myBomber.setPower(BombermanGame.myBomber.getPower() + 1);
                System.out.println("yeb");
                BombermanGame.stillObjects.remove(this);
            }
        }
    }
}
