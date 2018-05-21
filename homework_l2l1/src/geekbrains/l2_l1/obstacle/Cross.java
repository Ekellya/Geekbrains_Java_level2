package geekbrains.l2_l1.obstacle;

import geekbrains.l2_l1.partisipant.Competitor;

public class Cross extends Obstacle {
    int length;

    public Cross(int length) {
        this.length = length;
    }

    @Override
    public void doIt(Competitor competitor) {
        competitor.run(length);
    }
}
