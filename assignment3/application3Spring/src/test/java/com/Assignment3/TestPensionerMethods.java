package com.Assignment3;

import junit.framework.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by student on 3/9/16.
 */
public class TestPensionerMethods {
    private LoanIntrest intrest;
    @Before
    public void setUp() throws Exception {
        ApplicationContext apcontext = new AnnotationConfigApplicationContext(Appconfig.class);
        intrest =(LoanIntrest) apcontext.getBean("calcIntrest");

    }

    @After
    public void tearDown() throws Exception {


    }

    @Test
    public void testIntrestMethod() throws Exception {
        double intrestAmount=intrest.calcIntrest(100,0.5,2);

        Assert.assertEquals(100.0,intrestAmount);

    }
}
