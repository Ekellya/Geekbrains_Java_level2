package geekbrains.l2_l1.obstacle;

import geekbrains.l2_l1.partisipant.Competitor;

public class Wall extends Obstacle {
    int height;

    public Wall(int height) { this.height = height; }

    @Override
    public void doIt(Competitor competitor) {
        competitor.jump(height);
    }
}
