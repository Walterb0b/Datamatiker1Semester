package Lesson20.UnitTest;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DemigodTest {
    Demigod demigod = new Demigod("Annabeth", "Athena", 15);
    @Test
    void getName() {
        assertEquals("Annabeth", demigod.getName());
    }
    @Test
    void nameIsEmpty(){
        assertThrows(IllegalArgumentException.class, () ->
                new Demigod("", "Athena", 20));
    }

    @Test
    void getGodParent() {
        assertEquals("Athena", demigod.getGodParent());
    }

    @Test
    void getAge() {
        assertEquals(15, demigod.getAge());
    }

    @Test
    void isEligibleForQuest() {
        Demigod d = new Demigod ("john", "zeus", 8);
        assertFalse(d.isEligibleForQuest());
    }

    @Test
    void getCampCabin() {
        assertEquals("Cabin 6", demigod.getCampCabin());
    }
}