package io.zipcoder.pets;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by manjushadas on 5/4/16.
 */
public class CatSpec {

    @Test
    public void catSpeakTest() {
    Cat cat = new Cat("Tom");
    String expectedValue = "Meow";
    String actualValue =  cat.speak();
    Assert.assertEquals(expectedValue, actualValue);
    }
    @Test
    public void getCatTest(){
        Pets cat = new Cat("Tom");
        String expectedValue = "Tom";
        String actualValue = cat.getPetName();
        Assert.assertEquals(expectedValue,actualValue);
    }


}
