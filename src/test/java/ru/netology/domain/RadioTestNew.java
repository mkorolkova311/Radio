package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioTestNew {
    @Test
    public void shouldNextStationTest() {
        RadioNew Radio1 = new RadioNew();
        Radio1.setNumberOfCurrentStation(9);
        Radio1.NextStation();
        assertEquals(0, Radio1.getNumberOfCurrentStation());
    }

    @Test
    public void shouldPrevStationTest() {
        RadioNew Radio1 = new RadioNew();
        Radio1.setNumberOfCurrentStation(0);
        Radio1.PrevStation();
        assertEquals(9, Radio1.getNumberOfCurrentStation());
    }

    @Test
    public void shouldNexSoundtVolumeTest() {
        RadioNew Radio1 = new RadioNew();
        Radio1.setSoundVolume(10);
        Radio1.NextSoundVolume();
        assertEquals(10, Radio1.getSoundVolume());
    }
    @Test
    public void shouldPrevSoundVolumeTest() {
        RadioNew Radio1 = new RadioNew();
        Radio1.setSoundVolume(0);
        Radio1.PrevSoundVolume();
        assertEquals(0, Radio1.getSoundVolume());
    }

}

