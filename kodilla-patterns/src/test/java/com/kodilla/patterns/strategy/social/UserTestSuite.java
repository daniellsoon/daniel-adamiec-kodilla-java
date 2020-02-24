package com.kodilla.patterns.strategy.social;

import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {

    @Test
    public void  testDefaultSharingStrategies() {
        //Given
        User danny = new ZGeneration("Danny");
        User anja = new YGeneration("Anja");
        User woytek = new Millenials("Woytek");

        //When
        String facebookPublisher = woytek.social();
        String twitterPublisher = anja.social();
        String snapPublisher = danny.social();

        //Then
        Assert.assertEquals("Facebook", facebookPublisher);
        Assert.assertEquals("Twitter", twitterPublisher);
        Assert.assertEquals("Snapchat", snapPublisher);
    }

    @Test
    public void testIndividualSharingStrategy(){
        //Given
        User danny = new ZGeneration("Danny");

        //When
        String dannyPublish = danny.social();
        Assert.assertEquals("Snapchat", dannyPublish);

        //Then
        danny.setSocialPublisher(new TwitterPublisher());
        String dannyNewPublish = danny.social();
        Assert.assertEquals("Twitter", dannyNewPublish);


    }
}
