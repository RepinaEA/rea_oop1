package ru.netology.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioTest {

    @ParameterizedTest
    @CsvFileSource(resources={"/Station.csv"})
    public void newStation(int currentStation, int expected) {
        Radio rad = new Radio();

        rad.setCurrentStation(currentStation);

        int actual = rad.getCurrentStation();


        Assertions.assertEquals(expected, actual);
    }
    @ParameterizedTest
    @CsvFileSource(resources={"/NextStation.csv"})
    public void nextStation(int currentStation, int expected) {
        Radio rad = new Radio();

        rad.setCurrentStation(currentStation);
        int x = rad.getCurrentStation();
        rad.setNextStation(x);

        int actual = rad.getNextStation();


        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(resources={"/PrevStation.csv"})
    public void prevStation(int currentStation, int expected) {
        Radio rad = new Radio();

        rad.setCurrentStation(currentStation);
        int x = rad.getCurrentStation();
        rad.setPrevStation(x);

        int actual = rad.getPrevStation();


        Assertions.assertEquals(expected, actual);
    }



    @ParameterizedTest
    @CsvFileSource(resources={"/Volume.csv"})
    public void newVolume(int currentVolume, int expected) {
        Radio rad = new Radio();

        rad.setCurrentVolume(currentVolume);

        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(resources={"/IncreaseVolume.csv"})
    public void increaseVolume(int currentVolume, int expected) {
        Radio rad = new Radio();

        rad.setIncreaseVolume(currentVolume);

        int actual = rad.getIncreaseVolume();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(resources={"/ReduceVolume.csv"})
    public void reduceVolume(int currentVolume, int expected) {
        Radio rad = new Radio();

        rad.setReduceVolume(currentVolume);

        int actual = rad.getReduceVolume();

        Assertions.assertEquals(expected, actual);
    }
}
