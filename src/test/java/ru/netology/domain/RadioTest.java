package ru.netology.domain;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {
    @Test
    public void shouldNextStationTest() {
        Radio Radio1 = new Radio();
        Radio1.setNumberOfCurrentStation(0);
        Radio1.nextStation();
        assertEquals(1, Radio1.getNumberOfCurrentStation());
        Radio1.setNumberOfCurrentStation(9);
        Radio1.nextStation();
        assertEquals(0, Radio1.getNumberOfCurrentStation());
    }

    @Test
    public void shouldPrevStationTest() {
        Radio Radio1 = new Radio();
        Radio1.setNumberOfCurrentStation(1);
        Radio1.prevStation();
        assertEquals(0, Radio1.getNumberOfCurrentStation());
        Radio1.setNumberOfCurrentStation(0);
        Radio1.prevStation();
        assertEquals(9, Radio1.getNumberOfCurrentStation());
    }

    @Test
    public void shouldNexSoundtVolumeTest() {
        Radio Radio1 = new Radio();
        Radio1.setSoundVolume(9);
        Radio1.nextSoundVolume();
        assertEquals(10, Radio1.getSoundVolume());
        Radio1.setSoundVolume(10);
        Radio1.nextSoundVolume();
        assertEquals(10, Radio1.getSoundVolume());
    }

    @Test
    public void shouldPrevSoundVolumeTest() {
        Radio Radio1 = new Radio();
        Radio1.setSoundVolume(1);
        Radio1.prevSoundVolume();
        assertEquals(0, Radio1.getSoundVolume());
        Radio1.setSoundVolume(0);
        Radio1.prevSoundVolume();
        assertEquals(0, Radio1.getSoundVolume());

    }

    }


