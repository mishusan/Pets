package io.zipcoder.pets;

/**
 * Created by manjushadas on 5/4/16.
 */
public class Cat extends Pets{

    public Cat(String name) {
        setPetName(name);
    }
    public String speak() {
        return "Meow";
    }
}

