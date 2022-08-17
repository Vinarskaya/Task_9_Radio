package ru.netology.javaqa.radio.services;

public class Radio {
    private int numberOfStation = 10;
    private int minStation = 0;
    private int maxStation = numberOfStation - 1;
    private int currentStation;
    private int maxVolume = 100;
    private int minVolume = 0;
    private int currentVolume;

    public Radio() {
        this.numberOfStation = this.numberOfStation;
    }
    public Radio(int numberOfStations) {
        this.maxStation = numberOfStations - 1;
        if (this.maxStation < this.minStation){
            this.maxStation = this.minStation;
        }
    }

    public int getMaxStation() {
        return maxStation;
    }

    public int getMinStation() {
        return minStation;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation < minStation) {
            return;
        }
        if (newCurrentStation > maxStation) {
            return;
        }
        currentStation = newCurrentStation;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume <= minVolume) {
            currentVolume = minVolume;
        }
        else if (newCurrentVolume >= maxVolume) {
            currentVolume = maxVolume;
        }
        else {
            currentVolume = newCurrentVolume;
        }
    }

    public void next() {
        if (currentStation < maxStation) {
            currentStation = currentStation + 1;
        }
        else {
            currentStation = minStation;
        }
    }

    public void prev() {
        if (currentStation > minStation) {
            currentStation = currentStation - 1;
        }
        if (currentStation == 0) {
            currentStation = maxStation;
        }
    }

    public void increaseTheVolume() {
        if (currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;
            return;
        }
        else {
            currentVolume = maxVolume;
        }
    }

    public void turnDownTheVolume() {
        if (currentVolume > minVolume) {
            currentVolume = currentVolume - 1;
        }
        else {
            currentVolume = minVolume;
        }
    }
}
