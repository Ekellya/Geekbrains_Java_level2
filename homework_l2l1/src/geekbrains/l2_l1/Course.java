package geekbrains.l2_l1;

import geekbrains.l2_l1.obstacle.Obstacle;
import geekbrains.l2_l1.partisipant.Competitor;

public class Course {
    String name;

    Obstacle[] obstacles;

    public Course(String name, Obstacle... obstacles) {
        this.name = name;
        this.obstacles = obstacles;
    }

    public void successfulParticipants(Team [] teams) {
        for (Team team : teams) {
            Competitor[] result = team.getAllSuccessfulParticipants(this.obstacles);
            for (int i = 0; i <= result.length - 1; i++) {
                if (result[i] != null) {
                    System.out.println(team.getTeamName() + ' '  + result[i].getType() + ' ' + result[i].getName() + " преодолел всю дистанцию");
                }
            }
        }
    }

    public boolean resultOfCourse(Team team) {
        Competitor[] result = team.getAllSuccessfulParticipants(this.obstacles);
        return result.length > 1;
    }
}