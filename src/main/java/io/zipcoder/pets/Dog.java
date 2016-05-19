package io.zipcoder.pets;

/**
 * Created by manjushadas on 5/4/16.
 */
public class Dog extends Pets {

    public Dog(String name) {
        setPetName(name);
    }

    public String speak() {
        return "Woof!";
    }
}

