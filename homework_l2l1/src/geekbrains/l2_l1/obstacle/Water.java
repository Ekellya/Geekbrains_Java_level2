package geekbrains.l2_l1.obstacle;

import geekbrains.l2_l1.partisipant.Competitor;

public class Water extends Obstacle {
    int length;

    public Water(int length) {
        this.length = length;
    }

    @Override
    public void doIt(Competitor competitor) {
        competitor.swim(length);
    }
}
