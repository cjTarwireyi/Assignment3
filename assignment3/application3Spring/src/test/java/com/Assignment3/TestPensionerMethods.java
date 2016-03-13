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
   private ApplicationContext apcontext;
    @Before
    public void setUp() throws Exception {
       apcontext = new AnnotationConfigApplicationContext(Appconfig.class);
        intrest =(LoanIntrest) apcontext.getBean("calculate Intrest");


         }



    @After
    public void tearDown() throws Exception {


    }

    @Test
    public void testIntrestMethod() throws Exception {
        double intrestAmount=intrest.calcIntrest(100,2)*0.5;

        Assert.assertEquals(50.0,intrestAmount);

        System.out.print(apcontext.getBean("calculate Intrest"));

    }
}
