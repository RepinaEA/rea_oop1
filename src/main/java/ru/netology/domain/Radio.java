package ru.netology.domain;
public class Radio {

    private int currentStation;
   //метод выбора станции циферкой
    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation < 0) {
            return;
        }
        if (newCurrentStation >9) {
            return;
        }
        this.currentStation = newCurrentStation;
    }
    public int getCurrentStation() {
        return currentStation;
    }

    //выбор следующей станции кнопкой next
    public void setNextStation(int newCurrentStation) {
        newCurrentStation++;
        if (newCurrentStation == 10) {
            newCurrentStation = 0;
        }
        currentStation = newCurrentStation;
    }
    public int getNextStation() {
        return currentStation;
    }

    //выбор предыдущей станции кнопкой prev
    public void setPrevStation(int newCurrentStation) {
        newCurrentStation = newCurrentStation - 1;
        if (newCurrentStation == -1) {
            newCurrentStation = 9;
        }
        this.currentStation = newCurrentStation;
    }
    public int getPrevStation() {
        return currentStation;
    }


    private int currentVolume;

    //метод выбора громкости циферкой
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


    public void setIncreaseVolume(int newCurrentVolume) {
        if (newCurrentVolume < 10) {
            newCurrentVolume++;
        }
        if (newCurrentVolume == 10) {
            newCurrentVolume = 10;
        }
        this.currentVolume = newCurrentVolume;
    }
    public int getIncreaseVolume() {
        return currentVolume;
    }


    public void setReduceVolume(int newCurrentVolume) {
        if (newCurrentVolume > 0) {
            newCurrentVolume = newCurrentVolume - 1;
        }
        if (newCurrentVolume == 0) {
            newCurrentVolume = 0;
        }
        this.currentVolume = newCurrentVolume;
    }
    public int getReduceVolume() {
        return currentVolume;
    }




}
