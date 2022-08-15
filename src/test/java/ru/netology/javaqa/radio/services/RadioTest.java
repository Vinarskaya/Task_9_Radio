package ru.netology.javaqa.radio.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldSetStation() {
        Radio rad = new Radio();

        rad.setCurrentStation(8);

        int expected = 8;
        int actual = rad.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationIf10() {
        Radio rad = new Radio();

        rad.setCurrentStation(10);

        int expected = 0;
        int actual = rad.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationIfNegativeNumber() {
        Radio rad = new Radio();

        rad.setCurrentStation(-1);

        int expected = 0;
        int actual = rad.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextStation() {
        Radio rad = new Radio();
        rad.setCurrentStation(8);

        rad.next();

        int expected = 9;
        int actual = rad.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextStationIf9() {
        Radio rad = new Radio();
        rad.setCurrentStation(9);

        rad.next();

        int expected = 0;
        int actual = rad.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldSetPrevStation() {
        Radio rad = new Radio();
        rad.setCurrentStation(8);

        rad.prev();

        int expected = 7;
        int actual = rad.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevStationIfZero() {
        Radio rad = new Radio();
        rad.setCurrentStation(0);

        rad.prev();

        int expected = 9;
        int actual = rad.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolume() {
        Radio rad = new Radio();

        rad.setCurrentVolume(8);

        int expected = 8;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolumeIf11() {
        Radio rad = new Radio();

        rad.setCurrentVolume(11);

        int expected = 0;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolumeIfNegativeNumber() {
        Radio rad = new Radio();

        rad.setCurrentVolume(-1);

        int expected = 0;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseTheVolume() {
        Radio rad = new Radio();
        rad.setCurrentVolume(8);

        rad.increaseTheVolume();

        int expected = 9;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseTheVolumeIf10() {
        Radio rad = new Radio();
        rad.setCurrentVolume(10);

        rad.increaseTheVolume();

        int expected = 10;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTurnDownTheVolume() {
        Radio rad = new Radio();
        rad.setCurrentVolume(8);

        rad.turnDownTheVolume();

        int expected = 7;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTurnDownTheVolumeIfZero() {
        Radio rad = new Radio();
        rad.setCurrentVolume(0);

        rad.turnDownTheVolume();

        int expected = 0;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

}
