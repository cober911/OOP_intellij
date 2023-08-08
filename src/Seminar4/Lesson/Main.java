package Seminar4.Lesson;

import Seminar4.Lesson.Team.Team;
import Seminar4.Lesson.Warior.Archer;
import Seminar4.Lesson.Warior.Assasin;
import Seminar4.Lesson.Weapon.Bow;
import Seminar4.Lesson.Weapon.Knif;

public class Main {
    public static void main(String[] args) {
        Team<Archer> archerTeam = new Team<>();
        archerTeam.add(new Archer("Elf", new Bow(), 30))
                  .add(new Archer("Kumka", new Bow(), 15));

        Team<Assasin> assasinTeam = new Team<>();
        assasinTeam.add(new Assasin("Speed", new Knif(), 40))
                   .add(new Assasin("Kenzo", new Knif(), 25));
        System.out.println(archerTeam);
        System.out.println(assasinTeam);

    }
}
