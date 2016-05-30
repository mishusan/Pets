package io.zipcoder.pets;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by manjushadas on 5/22/16.
 */
public class LlamaSpec {
    @Test
    public void llamaSpeakTest() {
        Llama llama = new Llama("Chester");
        String expectedValue = "Spit!";
        String actualValue =  llama.speak();
        Assert.assertEquals(expectedValue, actualValue);
    }
    @Test
    public void getllamaTest(){
        Pets llama = new Llama("Chester");
        String expectedValue = "Chester";
        String actualValue = llama.getPetName();
        Assert.assertEquals(expectedValue,actualValue);
    }
}
