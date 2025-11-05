package EksamensØvelser.Election;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CandidateTest {
Candidate c = new Candidate("John", "NSDAP", 100);
    @Test
    void getName() {
        assertEquals("John", c.getName());
    }

    @Test
    void getParty() {
        assertEquals("NSDAP", c.getParty());
    }

    @Test
    void getNumberOfVotes() {
        assertEquals(100, c.getNumberOfVotes());
    }
}