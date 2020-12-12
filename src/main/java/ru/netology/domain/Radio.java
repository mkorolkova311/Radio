package ru.netology.domain;



public class Radio {
    private int numberOfCurrentStation;
    private int soundVolume;

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
        if (this.numberOfCurrentStation == 9) {
            this.numberOfCurrentStation = 0;
        }
        else{this.numberOfCurrentStation++;}

    }

    public void prevStation() {
        if (this.numberOfCurrentStation == 0) {
            this.numberOfCurrentStation = 9;
        }
        else{this.numberOfCurrentStation--;}

    }

    public void nextSoundVolume() {
        if (this.soundVolume < 10) {
            this.soundVolume++;
        }
    }

    public void prevSoundVolume() {
        if (this.soundVolume > 0) {
            this.soundVolume--;
        }
    }
}
