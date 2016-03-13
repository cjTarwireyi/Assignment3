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
        double intrest=pensionerIntrest.calcIntrest(700.00,2)*0.5;
        Assert.assertEquals(350.0,intrest);

    }
}
