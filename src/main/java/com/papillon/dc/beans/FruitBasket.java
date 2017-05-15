package com.papillon.dc.beans;

import java.util.List;

/**
 * Created by papillon on 5/14/2017.
 */
public class FruitBasket {

    private String name;
    private List<String> fruits;

    public FruitBasket(String name,List<String> fruits){
        this.name = name;
        this.fruits = fruits;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(name);
        sb.append(" contains:\n");
        for(String s : fruits){
            sb.append(s);
            sb.append("\n");
        }
        return sb.toString();
    }
}
