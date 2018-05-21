package geekbrains.l2_l1;

import geekbrains.l2_l1.obstacle.Cross;
import geekbrains.l2_l1.obstacle.Wall;
import geekbrains.l2_l1.obstacle.Water;
import geekbrains.l2_l1.partisipant.Cat;
import geekbrains.l2_l1.partisipant.Dog;
import geekbrains.l2_l1.partisipant.Human;

public class Main {
    public static void main(String[] args) {

        Course course = new Course("Полоса препядствий №1", new Wall(1), new Wall(2), new Water(2), new Cross(11));
        Team[] teams = new Team[]{
                new Team("Команда А", new Human("Василий"), new Dog("Тузик"), new Cat("Корявочка"), new Cat("Белка")),
                new Team("Команда B"),
        };
        Team.teamInfo(teams);
        course.successfulParticipants(teams);
    }
}




