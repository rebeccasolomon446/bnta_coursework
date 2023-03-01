package models;


import Interfaces.ISwim;

public class Swimmer implements ISwim {

    private String name;

    public Swimmer(String name){

        this.name = name;
    }

    public String swim(int distance) {
        return this.name + " swam " + distance + "m";
    }


}
