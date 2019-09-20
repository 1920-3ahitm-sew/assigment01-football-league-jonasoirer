package at.htl.football;

public class Match {

    private String homeName;
    private String guestName;
    private int homeGoals;
    private int guestGoals;

    public Match(String firstTeam, String secondTeam, int firstTeamGoals, int secondTeamGoals) {
        this.homeName = firstTeam;
        this.guestName = secondTeam;
        this.homeGoals = firstTeamGoals;
        this.guestGoals = secondTeamGoals;
    }

    public String getHomeName() {
        return homeName;
    }

    public String getGuestName() {
        return guestName;
    }

    public int getHomeGoals() {
        return homeGoals;
    }

    public int getGuestGoals() {
        return guestGoals;
    }

    public int getHomePoints() {
        if (homeGoals > guestGoals) {
            return 3;
        }
        if (homeGoals == guestGoals) {
            return 1;
        }
        else {
            return 0;
        }
    }

    public int getGuestPoints() {
        if (homeGoals < guestGoals) {
            return 3;
        }
        if (homeGoals == guestGoals) {
            return 1;
        }
        else {
            return 0;
        }
    }
}
