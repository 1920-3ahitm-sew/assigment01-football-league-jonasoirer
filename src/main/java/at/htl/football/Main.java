package at.htl.football;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        League league = new League();
        new Main().printTable(league.getTable());
    }

    private void printTable(List<Team> listOfTeams) {
        Collections.sort(listOfTeams);
        System.out.printf("Team \t Pts \t W \t D \t L \t GF \t GA \t GD \n");
        for (int i = 0; i < listOfTeams.size(); i++) {
        System.out.printf(listOfTeams.get(i).getName() + "\t"
                + listOfTeams.get(i).getPoints() + "\t"
                + listOfTeams.get(i).getWins() + "\t"
                + listOfTeams.get(i).getDraws() + "\t"
                + listOfTeams.get(i).getDefeats() + "\t"
                + listOfTeams.get(i).getGoalsShot() + "\t"
                + listOfTeams.get(i).getGoalsReceived() + "\t"
                + listOfTeams.get(i).getGoalDifference() + "\n");
        }
    }
}
