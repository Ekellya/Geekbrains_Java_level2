package geekbrains.l2_l1;

import geekbrains.l2_l1.obstacle.Obstacle;
import geekbrains.l2_l1.partisipant.Cat;
import geekbrains.l2_l1.partisipant.Competitor;
import geekbrains.l2_l1.partisipant.Dog;
import geekbrains.l2_l1.partisipant.Human;

public class Team {
    String teamName;
    Competitor[] teamParticipants;

    public Team(String teamName, Competitor... teamParticipants){
        this.teamName = teamName;
        this.teamParticipants = teamParticipants;
    }
    public Team(String teamName){
        this.teamName = teamName;
        this.teamParticipants = new Competitor[]{
                new Human("Кирилл"),
                new Cat("Брюс"),
                new Dog("Мага"),
                new Human("Джонни"),
        };
    }

    public String getTeamName() { return this.teamName; }

    public void getAllParticipants(){
        for (Competitor a: this.teamParticipants){
            System.out.println(a.getType() + "  " + a.getName());
        }
    }

    public static void teamInfo(Team[] teams){
        for (Team team : teams) {
            System.out.println(team.getTeamName() + ": ");
            team.getAllParticipants();
            System.out.println();
        }
    }

    public boolean getResultOfTest(Competitor a, Obstacle[] course){
        for (Obstacle o : course) {
            o.doIt(a);
            if (!a.isOnDistance()) return false;
        }
        return true;
    }

    public Competitor[] getAllSuccessfulParticipants(Obstacle[] course){
        Competitor[] result = new Competitor[this.teamParticipants.length];
        int i = 0;
        for (Competitor a: this.teamParticipants){
            if (this.getResultOfTest(a, course)){
                result[i] = a;
                i++;
            }
        }
        return  result;
    }
}
