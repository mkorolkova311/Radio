package ru.netology.domain;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {
    @Test
    public void shouldCreate(){
        Radio Radio1 = new Radio();
        System.out.println("Hi");
    }
    @Test
    public void shouldCheckFields(){
        Radio Radio1 = new Radio();
        assertEquals(0, Radio1.numberOfCurrentStation);
        assertEquals(0, Radio1.soundVolume);
        assertFalse(Radio1.on);
        assertEquals(null, Radio1.name);
    }

}


