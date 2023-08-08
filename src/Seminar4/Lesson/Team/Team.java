package Seminar4.Lesson.Team;

import Seminar4.Lesson.Warior.Warior;

import java.util.ArrayList;
import java.util.List;

public class Team <T extends Warior> {
    List<T> team = new ArrayList<>();

    public Team<T> add(T warior) {
        team.add(warior);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder wariors = new StringBuilder();
        for (T item : team) {
            wariors.append(item);
            wariors.append("\n");
        }
        return wariors.toString();

    }
}
