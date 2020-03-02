package com.company;

import com.company.exmple4.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.Assert.*;

public class TestRolex {
    Rolex rolex;

    @Before
    public void setUp() throws Exception{
        rolex = new RolexImpl();
    }


    @Test
    public void checkDescriptionWithTomatoes(){
        rolex = new FreshTomatotoes(rolex);
        Assert.assertEquals(rolex.getDescription(), "This is a rolex with fresh tomatoes, ");
    }

    @Test
    public void  checkDescriptionWithSlicedCabbages(){
        rolex = new SlicedCabbages(rolex);
        Assert.assertEquals(rolex.getDescription(), "This is a rolex with sliced cabbages, ");
    }

    @Test
    public void checkDescriptionWithRawOnions(){
        rolex = new RawOnions(rolex);
        Assert.assertEquals(rolex.getDescription(), "This is a rolex with raw onions, " );

    }

    @Test
    public void checkDescriptionWithKetchUp(){
        rolex = new KetchUp(rolex);
        Assert.assertEquals(rolex.getDescription(), "This is a rolex with ketch up, ");
    }

    @Test
    public void checkDescriptionWithEverything(){
        rolex = new FreshTomatotoes(rolex);
        rolex = new SlicedCabbages(rolex);
        rolex = new RawOnions(rolex);
        rolex = new KetchUp(rolex);
        Assert.assertEquals(rolex.getDescription(), "This is a rolex with fresh tomatoes, sliced cabbages, raw onions, ketch up, ");

    }
}
