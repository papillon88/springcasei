package com.papillon.dc.beans;

import java.util.List;

/**
 * Created by papillon on 5/15/2017.
 */
public class Jungle {

    private Animal largest;
    private List<Animal> animals;

    public Animal getLargest() {
        return largest;
    }

    public void setLargest(Animal largest) {
        this.largest = largest;
    }

    public List<Animal> getAnimals() {
        return animals;
    }

    public void setAnimals(List<Animal> animals) {
        this.animals = animals;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(largest+"\n");
        for(Animal animal : animals){
            sb.append(animal+"\n");
        }
        return sb.toString();
    }
}
