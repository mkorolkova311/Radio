package ru.netology.domain.constructor;
import java.util.Scanner;

public class Radio {
    private int amountStations;
    private int firstStation = 0;
    private int lastStation;
    private int numberOfCurrentStation = firstStation;
    private int soundVolume = 10;
    private int minVolume = 0;
    private int maxVolume = 100;

    public Radio() {
        this.amountStations = 10;
        this.lastStation = this.amountStations;
    }

    public Radio(int maxStation) {
        this.amountStations = maxStation;
        this.lastStation = this.amountStations;
    }

    public int getAmountStations() {
        return amountStations;
    }

    public void setAmountStations(int amountStations) {
        this.amountStations = amountStations;
    }

    public int getFirstStation() {
        return firstStation;
    }

    public void setFirstStation(int firstStation) {
        this.firstStation = firstStation;
    }

    public int getLastStation() {
        return lastStation;
    }

    public void setLastStation(int lastStation) {
        this.lastStation = lastStation;
    }


    public int getNumberOfCurrentStation() {
        return numberOfCurrentStation;
    }

    public void setNumberOfCurrentStation(int numberOfCurrentStation) {
        this.numberOfCurrentStation = numberOfCurrentStation;
    }

    public int getSoundVolume() {
        return soundVolume;
    }

    public void setSoundVolume(int soundVolume) {
        this.soundVolume = soundVolume;
    }

    public void nextStation() {
        if (this.numberOfCurrentStation == this.lastStation) {
            this.numberOfCurrentStation = this.firstStation;
        }
        else{this.numberOfCurrentStation++;}

    }

    public void prevStation() {
        if (this.numberOfCurrentStation == this.firstStation) {
            this.numberOfCurrentStation = this.lastStation;
        }
        else{this.numberOfCurrentStation--;}

    }

    public void nextSoundVolume() {
        if (this.soundVolume < this.maxVolume) {
            this.soundVolume++;
        }
    }

    public void prevSoundVolume() {
        if (this.soundVolume > this.minVolume) {
            this.soundVolume--;
        }
    }
    public int getMinVolume() {
        return minVolume;
    }

    public void setMinVolume(int minVolume) {
        this.minVolume = minVolume;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public void setMaxVolume(int maxVolume) {
        this.maxVolume = maxVolume;
    }

    public void inputCurrentStation() {
        Scanner in = new Scanner(System.in);
        setNumberOfCurrentStation(in.nextInt());
    }
}
