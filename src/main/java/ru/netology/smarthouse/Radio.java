package ru.netology.smarthouse;

public class Radio {

    private int currentStation;
    private int currentVolume;

    public int getCurrentStation () {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation < 0) {
            currentStation = 0;
        }
        if (currentStation > 9) {
            currentStation = 9;
        }
        this.currentStation = currentStation;
    }

    public void nextStation() {
        currentStation = currentStation < 9 ? (currentStation += 1) : 0;
    }

    public void prevStation() {
        currentStation = currentStation > 0 ? (currentStation - 1) : 9;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume (int currentVolume) {
        if (currentVolume > 10) {
            currentVolume = 10;
        }
        this.currentVolume = currentVolume;
    //          currentVolume = newVolume > 10 ? (newVolume = 10) : newVolume;
    }

    public void plusVolume() {
        if (currentVolume < 10) {
            currentVolume += 1;
        }
    }

    public void minusVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }

}
