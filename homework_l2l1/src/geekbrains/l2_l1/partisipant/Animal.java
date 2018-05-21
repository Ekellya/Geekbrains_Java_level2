package geekbrains.l2_l1.partisipant;

public class Animal implements Competitor {
    String type;
    String name;

    int maxRunDistance;
    int maxJumpHeight;
    int maxSwimDistance;
    boolean onDistance;

    public Animal(
            String type,
            String name,
            int maxRunDistance,
            int maxJumpHeight,
            int maxSwimDistance
    ) {
        this.type = type;
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxJumpHeight = maxJumpHeight;
        this.maxSwimDistance = maxSwimDistance;
        this.onDistance = true;
    }

    @Override
    public boolean isOnDistance() {return onDistance;}
    @Override
    public void run(int dist) {if (dist > maxRunDistance) {onDistance = false;}}
    @Override
    public void jump(int height) {if (height > maxJumpHeight) {onDistance = false;}}
    @Override
    public void swim(int dist) {if (dist > maxSwimDistance) {onDistance = false;}}
    @Override
    public void info() {System.out.println(type + "  " + name + " - " + onDistance);}
    @Override
    public String getName() {return this.name;}
    @Override
    public String getType() {return this.type;}
}


