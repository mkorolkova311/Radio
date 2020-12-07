package ru.netology.domain;

public class RadioNew {
    String name;
    private int numberOfCurrentStation;
    private int soundVolume;
    private boolean on;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfCurrentStation() {
        return numberOfCurrentStation;
    }

    public void setNumberOfCurrentStation(int numberOfCurrentStation) {
        if (numberOfCurrentStation < 0){
            this.numberOfCurrentStation = 9;
        }
        if (numberOfCurrentStation > 9){
            this.numberOfCurrentStation = 0;
        }
        this.numberOfCurrentStation = numberOfCurrentStation;
    }

    public int getSoundVolume() {
        return soundVolume;
    }
    public void setSoundVolume(int soundVolume) {
        if (soundVolume < 0){
            return;
        }
        if (soundVolume > 10){
            return;
        }
        this.soundVolume = soundVolume;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

}
