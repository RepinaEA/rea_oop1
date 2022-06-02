package ru.netology.domain;

public class Radio {

    private int currentStation;

    private int countStation;

    private int maxStation = 9;

    private int minStation;

    private int currentVolume;

    public Radio(int countStation) {
        maxStation = countStation - 1;
        this.countStation = countStation;
    }

    public Radio() {
    }

    //метод выбора станции номером станции
    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation < minStation) {
            newCurrentStation = minStation;
        }
        if (newCurrentStation > maxStation) {
            newCurrentStation = maxStation;
        }
        this.currentStation = newCurrentStation;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    //выбор следующей станции кнопкой next
    public void setNextStation() {
        currentStation++;
        if (currentStation == maxStation + 1) {
            currentStation = minStation;
        }
    }

    public int getNextStation() {
        return currentStation;
    }

    //выбор предыдущей станции кнопкой prev
    public void setPrevStation() {
        currentStation = currentStation - 1;
        if (currentStation == minStation - 1) {
            currentStation = maxStation;
        }
    }

    public int getPrevStation() {
        return currentStation;
    }


    //метод выбора громкости номером громкости
    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0) {
            newCurrentVolume = 0;
        }
        if (newCurrentVolume > 100) {
            newCurrentVolume = 100;
        }
        this.currentVolume = newCurrentVolume;
    }

    public int getCurrentVolume() {

        return currentVolume;
    }


    //увеличение громкости
    public void setIncreaseVolume() {
        currentVolume++;
        if (currentVolume == 101) {
            currentVolume = 100;
        }

    }

    public int getIncreaseVolume() {

        return currentVolume;
    }


    //уменьшение громкости
    public void setReduceVolume() {

        currentVolume = currentVolume - 1;

        if (currentVolume == -1) {
            currentVolume = 0;
        }

    }

    public int getReduceVolume() {

        return currentVolume;
    }


}
