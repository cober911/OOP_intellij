package Seminar4.Ilya.zoo;

import Seminar4.Ilya.animals.Lion;
import Seminar4.Ilya.animals.Snake;
import Seminar4.Ilya.animals.Wolf;
import Seminar4.Ilya.cage.AnimalCage;

public class Zoo {
    private AnimalCage<Wolf> wolfCage;
    private AnimalCage<Lion> lionCage;
    private AnimalCage<Snake> snaktCage;

    public AnimalCage<Wolf> getwolfCage() {
        return wolfCage;
    }
    public void setLionCage(AnimalCage<Lion> lionCage) {
        this.lionCage = lionCage;
    }

    public AnimalCage<Lion> getLionCage() {
        return lionCage;
    }
    public void setWolfCage(AnimalCage<Wolf> wolfCage) {
        this.wolfCage = wolfCage;
    }

    public AnimalCage<Snake> getSnaktCage() {
        return snaktCage;
    }
    public void setSnaktCage(AnimalCage<Snake> snaktCage) {
        this.snaktCage = snaktCage;
    }
}