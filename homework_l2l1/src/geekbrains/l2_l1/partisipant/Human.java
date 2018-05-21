package geekbrains.l2_l1.partisipant;

public class Human implements Competitor {
    String name;
    String type;
    int maxRunDistance;
    int maxJumpHeight;
    int maxSwimDistance;
    boolean onDistance;

    @Override
    public boolean isOnDistance() {
        return onDistance;
    }

    public Human(String name) {
        this.name = name;
        this.type = "Человек";
        this.maxRunDistance = 5000;
        this.maxJumpHeight = 30;
        this.maxSwimDistance = 200;
        this.onDistance = true;
    }

    @Override
    public void run(int dist) { if (dist > maxRunDistance) { onDistance = false; } }
    @Override
    public void jump(int height) { if (height > maxJumpHeight) { onDistance = false; } }
    @Override
    public void swim(int dist) { if (dist > maxSwimDistance) { onDistance = false; } }
    @Override
    public void info() {
        System.out.println(type + " " + name + " : " + onDistance);
    }
    @Override
    public String getName() {
        return this.name;
    }
    @Override
    public String getType() {
        return this.type;
    }
}