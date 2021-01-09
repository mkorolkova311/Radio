package ru.netology.domain.constructor;

import org.junit.jupiter.api.Test;
import ru.netology.domain.Radio;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioTest {
    @Test
    public void shouldNextStationTest() {
        ru.netology.domain.constructor.Radio Radio1 = new ru.netology.domain.constructor.Radio();
        Radio1.setNumberOfCurrentStation(Radio1.getFirstStation());
        Radio1.nextStation();
        assertEquals(Radio1.getFirstStation() + 1, Radio1.getNumberOfCurrentStation());
        Radio1.setNumberOfCurrentStation(Radio1.getLastStation());
        Radio1.nextStation();
        assertEquals(Radio1.getFirstStation(), Radio1.getNumberOfCurrentStation());
    }

    @Test
    public void shouldPrevStationTest() {
        ru.netology.domain.constructor.Radio Radio1 = new ru.netology.domain.constructor.Radio();
        Radio1.setNumberOfCurrentStation(Radio1.getLastStation());
        Radio1.prevStation();
        assertEquals(Radio1.getLastStation() - 1, Radio1.getNumberOfCurrentStation());
        Radio1.setNumberOfCurrentStation(Radio1.getFirstStation());
        Radio1.prevStation();
        assertEquals(Radio1.getLastStation(), Radio1.getNumberOfCurrentStation());
    }

    @Test
    public void shouldNexSoundVolumeTest() {
        ru.netology.domain.constructor.Radio Radio1 = new ru.netology.domain.constructor.Radio();
        Radio1.setSoundVolume(Radio1.getMinVolume());
        Radio1.nextSoundVolume();
        assertEquals(Radio1.getMinVolume() + 1, Radio1.getSoundVolume());
        Radio1.setSoundVolume(Radio1.getMaxVolume());
        Radio1.nextSoundVolume();
        assertEquals(Radio1.getMaxVolume(), Radio1.getSoundVolume());
    }

    @Test
    public void shouldPrevSoundVolumeTest() {
        ru.netology.domain.constructor.Radio Radio1 = new ru.netology.domain.constructor.Radio();
        Radio1.setSoundVolume(Radio1.getMaxVolume());
        Radio1.prevSoundVolume();
        assertEquals(Radio1.getMaxVolume() - 1, Radio1.getSoundVolume());
        Radio1.setSoundVolume(Radio1.getMinVolume());
        Radio1.prevSoundVolume();
        assertEquals(Radio1.getMinVolume(), Radio1.getSoundVolume());

    }

    @Test
    public void shouldInitObjectNoArgs() {
        ru.netology.domain.constructor.Radio Radio1 = new ru.netology.domain.constructor.Radio();
        assertEquals(10, Radio1.getAmountStations());
    }

    @Test
    public void shouldInitObjectAmountArg() {
        ru.netology.domain.constructor.Radio Radio1 = new ru.netology.domain.constructor.Radio(55);
        assertEquals(55, Radio1.getAmountStations());
    }

}

