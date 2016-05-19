package io.zipcoder.pets;

import java.util.Scanner;

/**
 * Created by manjushadas on 5/4/16.
 */
public abstract class Pets {
    public String petType;
    public String petName;
    public Pets(String name){
        this.petName=name;
    }
    public Pets(){}
    public  String getPetName(){
        return petName;
    }
    public void setPetName(String name){
        this.petName=name;
    }
    public abstract String speak();




}
