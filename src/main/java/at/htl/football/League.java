package at.htl.football;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class League {

    private List<Team> teams = new ArrayList<>();
    private String[] fileData;

    public League() throws IOException {
        Path file = Paths.get("bundesliga-1819.csv");
        List<String> fileLines;
        fileLines = Files.readAllLines(file);

        for (int i = 1; i < fileLines.size(); i++) {
            fileData = fileLines.get(i).toString().split(";");
            Match match = new Match(fileData[1], fileData[2], Integer.parseInt(fileData[3]), Integer.parseInt(fileData[4]));
            this.addMatchResult(match);
        }
    }

    private Team findOrCreateTeam(String teamName) {
        for(int k = 0; k < teams.size(); k++) {
            if (teams.get(k).getName().equals(teamName)) {
                return teams.get(k);
            }
        }
        Team newTeam = new Team(teamName);
        teams.add(newTeam);
        return newTeam;
    }

    public void addMatchResult(Match match) {
        findOrCreateTeam(match.getHomeName()).addMatch(match);
        findOrCreateTeam(match.getGuestName()).addMatch(match);
    }


    public List<Team> getTable() {
        return teams;
    }


}
