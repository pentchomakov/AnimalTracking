package com.pentchomakov.wildanimaltracking.model;

public class Animal {

    private int animalId;
    private String animalName;
    private String animalLocation;

    public Animal (int animalId, String animalName, String animalLocation) {
        this.animalId = animalId;
        this.animalName = animalName;
        this.animalLocation = animalLocation;
    }

    public int getAnimalId() {
        return animalId;
    }

    public void setAnimalId(int animalId) {
        this.animalId = animalId;
    }

    public String getAnimalName() {
        return animalName;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public String getAnimalLocation() {
        return animalLocation;
    }

    public void setAnimalLocation(String animalLocation) {
        this.animalLocation = animalLocation;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "animalId=" + animalId +
                ", animalName='" + animalName + '\'' +
                ", animalLocation='" + animalLocation + '\'' +
                '}';
    }
}
