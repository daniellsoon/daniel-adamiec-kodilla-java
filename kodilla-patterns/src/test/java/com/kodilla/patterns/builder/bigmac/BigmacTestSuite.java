package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {

    @Test
    public void testBigmacNew() {
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .bun("with sesame")
                .burgers(2)
                .sauce("hot")
                .ingredient("onion")
                .ingredient("cucumber")
                .ingredient("mushrooms")
                .build();
        System.out.println(bigmac);
        //When
        int howManyIngredients = bigmac.getIngredients().size();
        String whatBun = bigmac.getBun();
        String whatSauce = bigmac.getSauce();
        int howManyBurgers = bigmac.getBurgers();
        //Then
        Assert.assertEquals(3, howManyIngredients);
        Assert.assertEquals("with sesame", whatBun);
        Assert.assertEquals("hot", whatSauce);
        Assert.assertEquals(2, howManyBurgers);
    }
}
