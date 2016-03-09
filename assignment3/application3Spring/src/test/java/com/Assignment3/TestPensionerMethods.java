package com.Assignment3;

import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by student on 3/9/16.
 */
public class TestPensionerMethods {
    @Before
    public void setUp() throws Exception {
        

    }

    @Test
    public void testIntrestMethod() throws Exception {
        LoanIntrest pensionerIntrest = new Pensioneer();
        double intrest=pensionerIntrest.intrest(700.00,0.2,2);
        Assert.assertEquals(280.0,intrest);

    }
}
