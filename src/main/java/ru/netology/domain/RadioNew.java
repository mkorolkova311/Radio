package ru.netology.domain;

public class RadioNew {
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

    public void NextStation() {
        if (this.numberOfCurrentStation == 9) {
            this.numberOfCurrentStation = 0;
        }
        else{this.numberOfCurrentStation++;}

    }

    public void PrevStation() {
        if (this.numberOfCurrentStation == 0) {
            this.numberOfCurrentStation = 9;
        }
        else{this.numberOfCurrentStation--;}

    }

    public void NextSoundVolume() {
        if (this.soundVolume < 10) {
            this.soundVolume++;
        }
    }

    public void PrevSoundVolume() {
        if (this.soundVolume > 0) {
            this.soundVolume--;
        }
    }
    }
