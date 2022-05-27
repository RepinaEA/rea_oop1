package ru.netology.domain;

public class Radio {

    private int currentStation;

    //метод выбора станции номером станции
    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation < 0) {
            return;
        }
        if (newCurrentStation > 9) {
            return;
        }
        this.currentStation = newCurrentStation;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    //выбор следующей станции кнопкой next
    public void setNextStation() {

        currentStation++;
        if (currentStation == 10) {
            currentStation = 0;
        }

    }

    public int getNextStation() {
        return currentStation;
    }

    //выбор предыдущей станции кнопкой prev
    public void setPrevStation() {

        currentStation = currentStation - 1;
        if (currentStation == -1) {
            currentStation = 9;
        }
    }

    public int getPrevStation() {
        return currentStation;
    }


    private int currentVolume;

    //метод выбора громкости номером громкости
    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0) {
            return;
        }
        if (newCurrentVolume > 10) {
            return;
        }
        this.currentVolume = newCurrentVolume;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }


    //увеличение громкости
    public void setIncreaseVolume() {
        currentVolume++;
        if (currentVolume == 11) {
            currentVolume = 10;
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
