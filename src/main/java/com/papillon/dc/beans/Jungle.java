package com.papillon.dc.beans;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by papillon on 5/15/2017.
 */
public class Jungle {

    /*private Animal largest;
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
    }*/

    //initializing beans containing maps
    private Map<String,String> foods = new HashMap<>();
    private Map<String,Animal> animals = new HashMap<>();

    public Map<String, Animal> getAnimals() {
        return animals;
    }

    public void setAnimals(Map<String, Animal> animals) {
        this.animals = animals;
    }

    public Map<String, String> getFoods() {
        return foods;
    }

    public void setFoods(Map<String, String> foods) {
        this.foods = foods;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for(Map.Entry<String,String> map : foods.entrySet()){
            sb.append(map.getKey()+" "+map.getValue()+"\n");
        }
        sb.append("\n");
        for(Map.Entry<String,Animal> map : animals.entrySet()){
            sb.append(map.getKey()+" "+map.getValue()+"\n");
        }
        return sb.toString();
    }
}
