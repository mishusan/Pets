package io.zipcoder.pets;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by manjushadas on 5/4/16.
 */
public class DogSpec {
    @Test
    public void dogSpeakTest(){
        Dog dog = new Dog ("Jerry");
        String expectedValue = "Woof!";
        String actualValue = dog.speak();
        Assert.assertEquals(expectedValue,actualValue);
    }
    @Test
    public void getDogTest(){
        Pets dog = new Dog("Jerry");
        String expectedValue = "Jerry";
        String actualValue = dog.getPetName();
        Assert.assertEquals(expectedValue,actualValue);
    }
}
