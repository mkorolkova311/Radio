package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioTestNew {
    @Test
    public void shoulCheckCurrentStation() {
        RadioNew Radio1 = new RadioNew();
        assertEquals(0, Radio1.getNumberOfCurrentStation());
        Radio1.setNumberOfCurrentStation(5);
        assertEquals(5, Radio1.getNumberOfCurrentStation());
    }
    @Test
    public void shoulCheckVolume() {
        RadioNew Radio1 = new RadioNew();
        assertEquals(0, Radio1.getNumberOfCurrentStation());
        Radio1.setNumberOfCurrentStation(10);
        assertEquals(5, Radio1.getNumberOfCurrentStation());
    }
}
