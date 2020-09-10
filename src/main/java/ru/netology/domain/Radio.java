package ru.netology.domain;

import lombok.Getter;

@Getter

public class Radio {
    private int currentRadioStation;
    private int firstRadioStation = 0;
    private int lastRadioStation = 10;
    private int amountRadioStation = 10;

    private int currentSoundVolume;
    private int minSoundVolume = 0;
    private int maxSoundVolume = 100;

    public Radio(int currentRadioStation,
                 int firstRadioStation,
                 int lastRadioStation,
                 int amountRadioStation,
                 int currentSoundVolume,
                 int minSoundVolume,
                 int maxSoundVolume) {
        if (currentRadioStation > lastRadioStation)
            return;
        if (currentRadioStation < firstRadioStation)
            return;
        this.currentRadioStation = currentRadioStation;

        this.firstRadioStation = firstRadioStation;
        this.lastRadioStation = lastRadioStation;
        this.amountRadioStation = amountRadioStation;

        if (currentSoundVolume > maxSoundVolume)
            return;
        if (currentSoundVolume < minSoundVolume)
            return;
        this.currentSoundVolume = currentSoundVolume;
        this.minSoundVolume = minSoundVolume;
        this.maxSoundVolume = maxSoundVolume;
    }

    public void changeNextRadioStation() {
        if (currentRadioStation == lastRadioStation) {
            this.currentRadioStation = firstRadioStation;
        }
        else {
            currentRadioStation++;
        }
    }

    public void changePrevRadioStation() {
        if (currentRadioStation == firstRadioStation) {
            this.currentRadioStation = lastRadioStation;
        } else {
            currentRadioStation--;
        }
    }

    public void increaseCurrentSoundVolume() {
        if (currentSoundVolume < maxSoundVolume)
            currentSoundVolume++;
    }

    public void decreaseCurrentSoundVolume() {
        if (currentSoundVolume > minSoundVolume)
            currentSoundVolume--;
    }
}
