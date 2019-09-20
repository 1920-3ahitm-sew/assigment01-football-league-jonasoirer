package at.htl.football;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

class TeamTest {
    @Test
    public void wonCheck() {
        Team testTeam1 = new Team("testTeam1");
        testTeam1.addMatch(new Match("testTeam1", "testTeam2", 5, 4));
        assertThat(testTeam1.getPoints(), is(3));
        assertThat(testTeam1.getWins(), is(1));
    }

    @Test
    public void lostCheck() {
        Team testTeam2 = new Team("testTeam2");
        testTeam2.addMatch(new Match("testTeam2", "testTeam1", 4, 5));
        assertThat(testTeam2.getPoints(), is(0));
        assertThat(testTeam2.getDefeats(), is(1));
    }

    @Test
    public void drawCheck() {
        Team testTeam3 = new Team("testTeam3");
        testTeam3.addMatch(new Match("testTeam3", "testTeam4", 6,6));
        assertThat(testTeam3.getPoints(), is(1));
        assertThat(testTeam3.getDraws(), is(1));
    }


    @Test
    public void wonTwiceCheck() {
        Team testTeam1 = new Team("testTeam1");
        testTeam1.addMatch(new Match("testTeam1", "testTeam2", 5, 4));
        testTeam1.addMatch(new Match("testTeam1", "testTeam2", 6, 3));
        assertThat(testTeam1.getPoints(), is(6));
        assertThat(testTeam1.getWins(), is(2));
    }


    @Test
    public void lostTwiceCheck() {
        Team testTeam2 = new Team("testTeam2");
        testTeam2.addMatch(new Match("testTeam2", "testTeam1", 4, 5));
        testTeam2.addMatch(new Match("testTeam2", "testTeam1", 3, 6));
        assertThat(testTeam2.getPoints(), is(0));
        assertThat(testTeam2.getDefeats(), is(2));
    }

}