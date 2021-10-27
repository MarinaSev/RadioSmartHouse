package ru.netology.smarthouse;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {

    @Test
    public void shouldSetCurrentStation() {
        Radio rad = new Radio();
        rad.setCurrentStation(5);

        int expected = 5;
        int actual = rad.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentStation110() {
        Radio rad = new Radio();
        rad.setCurrentStation(110);

        assertEquals(110, rad.getCurrentStation());
    }

    @Test
    public void shouldGetNumberOfStations() {
        Radio rad = new Radio(110);

        assertEquals(110, rad.getNumberOfStations());
    }

    @Disabled
    @Test
    public void shouldSetNumberOfStations() {
        Radio rad = new Radio ();
        rad.setNumberOfStations(15);

        assertEquals(15, rad.getNumberOfStations());
    }

    @Test
    public void shouldConstructorSetNumberOfStations() {
        Radio rad = new Radio (15);

        assertEquals(15, rad.getNumberOfStations());
    }

    @Disabled
    @Test
    public void shouldSetNumberOfStationsLess10() {
        Radio rad = new Radio ();
        rad.setNumberOfStations(5);

        assertEquals(10, rad.getNumberOfStations());
    }

    @Test
    public void shouldConstructorSetNumberOfStationsLess10() {
        Radio rad = new Radio (5);

        assertEquals(10, rad.getNumberOfStations());
    }

    @Disabled
    @Test
    public void shouldSetNumberOfStationsNegative() {
        Radio rad = new Radio ();
        rad.setNumberOfStations(-5);

        assertEquals(10, rad.getNumberOfStations());
    }

    @Test
    public void shouldConstructorSetNumberOfStationsNegative() {
        Radio rad = new Radio (-5);

        assertEquals(10, rad.getNumberOfStations());
    }

    @Disabled
    @Test
    public void shouldSetNumberOfStations10() {
        Radio rad = new Radio ();
        rad.setNumberOfStations(10);

        assertEquals(10, rad.getNumberOfStations());
    }

    @Test
    public void shouldConstructorSetNumberOfStations10() {
        Radio rad = new Radio (10);

        assertEquals(10, rad.getNumberOfStations());
    }
    @Test
    public void shouldSetFactoryStation() {
        Radio rad = new Radio();

        assertEquals(9, rad.getMaxStation());
    }

    @Test
    public void shouldSetStationNegative() {
        Radio rad = new Radio();
        rad.setCurrentStation(-1);

        int expected = 0;
        int actual = rad.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldGetNextStation() {
        Radio rad = new Radio();
        rad.setCurrentStation(5);

        rad.nextStation();

        int expected = 6;
        int actual = rad.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldGetNextStationFromMax() {
        Radio rad = new Radio(20);
        rad.setCurrentStation(rad.getMaxStation());

        rad.nextStation();

        assertEquals(0, rad.getCurrentStation());
    }

    @Test
    public void shouldGetPreviousStationFrom1() {
        Radio rad = new Radio();
        rad.setCurrentStation(1);

        rad.prevStation();

        int expected = 0;
        int actual = rad.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldGetPreviousStationFrom0() {
        Radio rad = new Radio();
        rad.setCurrentStation(0);

        rad.prevStation();

        int expected = 9;
        int actual = rad.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldGetPreviousStationFromMax() {
        Radio rad = new Radio(20);

        rad.prevStation();

        assertEquals(19, rad.getCurrentStation());
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
    public void shouldSetCurrentVolumeBigNumber() {
        Radio rad = new Radio();
        rad.setCurrentVolume(1000);

        int expected = 100;
        int actual = rad.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldGetVolumePlusOne() {
        Radio rad = new Radio();
        rad.setCurrentVolume(3);

        rad.plusVolume();

        int expected = 4;
        int actual = rad.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldGetVolumePlusOneFrom100() {
        Radio rad = new Radio();
        rad.setCurrentVolume(100);

        rad.plusVolume();

        int expected = 100;
        int actual = rad.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldGetVolumeMinusOne() {
        Radio rad = new Radio();
        rad.setCurrentVolume(3);

        rad.minusVolume();

        int expected = 2;
        int actual = rad.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldGetVolumeMinusOneFrom0() {
        Radio rad = new Radio();
        rad.setCurrentVolume(0);

        rad.minusVolume();

        int expected = 0;
        int actual = rad.getCurrentVolume();

        assertEquals(expected, actual);
    }

}