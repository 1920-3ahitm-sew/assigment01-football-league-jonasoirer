package at.htl.football;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.junit.jupiter.api.Assertions.*;

class LeagueTest {
    @Test
    public void check() {
        int i = 1;
        int j = 2;
        int k = i + j;
        assertThat(k,is(3));
    }

    @Test
    public void listCheck() throws IOException {
        String[] fileData;

        Path file = Paths.get("bundesliga-1819.csv");
        List<String> fileLines;
        fileLines = Files.readAllLines(file);

        for (int i = 1; i < fileLines.size(); i++) {
            fileData = fileLines.get(i).toString().split(";");
        }
        assertThat(fileLines.get(1), is ("24.08.18;Bayern Munich;Hoffenheim;3;1"));
    }
}
