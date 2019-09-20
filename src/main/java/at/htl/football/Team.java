package at.htl.football;

public class Team implements Comparable<Team>{

    private String name;
    private int points;
    private int wins;
    private int draws;
    private int defeats;
    private int goalsShot;
    private int goalsReceived;

    public Team(String teamName) {
        this.name = teamName;
        this.points = 0;
        this.wins = 0;
        this.draws = 0;
        this.defeats = 0;
        this.goalsShot = 0;
        this.goalsReceived = 0;
    }

    public String getName() {
        return name;
    }

    public int getPoints() {
        return points;
    }

    public int getWins() {
        return wins;
    }

    public int getDraws() {
        return draws;
    }

    public int getDefeats() {
        return defeats;
    }

    public int getGoalsShot() {
        return goalsShot;
    }

    public int getGoalsReceived() {
        return goalsReceived;
    }

    public int getGoalDifference() {
        return  goalsShot - goalsReceived;
    }

    public void addMatch(Match match) {
        if(match.getHomeName().equals(this.name)) {
            if(match.getHomeGoals() > match.getGuestGoals()) {
                this.points = this.points + 3;
                this.wins++;
            }
            if(match.getHomeGoals() == match.getGuestGoals()) {
                this.points = this.points + 1;
                this.draws++;
            }
            if(match.getHomeGoals() < match.getGuestGoals()) {
                this.defeats++;
            }
            this.goalsShot = this.goalsShot + match.getHomeGoals();
            this.goalsReceived = this.goalsReceived + match.getGuestGoals();
            }
            else {
                if(match.getHomeGoals() < match.getGuestGoals()) {
                    this.points = this.points + 3;
                    this.wins++;
                }
                if(match.getHomeGoals() == match.getGuestGoals()) {
                    this.points = this.points + 1;
                    this.draws++;
                }
                if(match.getHomeGoals() > match.getGuestGoals()) {
                    this.defeats++;
                }
                this.goalsShot = this.goalsShot + match.getHomeGoals();
                this.goalsReceived = this.goalsReceived + match.getGuestGoals();
            }
    }

    @Override
    public int compareTo(Team otherTeam) {
        if (this.getPoints() > otherTeam.getPoints()) {
            return -1;
        }
        if (this.getPoints() < otherTeam.getPoints()) {
            return 1;
        }

        if(this.getGoalDifference() > otherTeam.getGoalDifference()) {
            return -1;
        }

        if(this.getGoalDifference() < otherTeam.getGoalDifference()) {
            return 1;
        }

        return 0;
    }
}
