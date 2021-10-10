package ru.netology.smarthouse;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {

    @Test
    public void shouldSetCurrentStation() {
        Radio rad = new Radio();

        rad.setCurrentStation(30);

        int expected = 9;
        int actual = rad.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldGetNextStation() {
        Radio rad = new Radio();
        rad.setCurrentStation(3);

        rad.nextStation();

        int expected = 4;
        int actual = rad.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldGetPreviousStation() {
        Radio rad = new Radio();
        rad.setCurrentStation(0);

        rad.prevStation();

        int expected = 9;
        int actual = rad.getCurrentStation();

        assertEquals(expected, actual);
    }


    @Test
    public void shouldSetCurrentVolume() {
        Radio rad = new Radio();

        rad.setCurrentVolume(3);

        int expected = 3;
        int actual = rad.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldGetVolumePlusOne() {
        Radio rad = new Radio();
        rad.setCurrentVolume(10);

        rad.plusVolume();

        int expected = 10;
        int actual = rad.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldGetVolumeMinusOne() {
        Radio rad = new Radio();
        rad.setCurrentVolume(0);

        rad.minusVolume();

        int expected = 0;
        int actual = rad.getCurrentVolume();

        assertEquals(expected, actual);
    }

}