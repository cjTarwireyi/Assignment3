package com.Assignment3;

import junit.framework.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by student on 3/13/16.
 */
public class TestStudent {
    @Before
    public void setUp() throws Exception {


    }

    StudentIntrest intrest= new StudentIntrest();


    @Test
    public void testIntrestMethod() throws Exception {
        double intrestAmount=intrest.calcIntrest(1000.00,10)*0.2;
        Assert.assertEquals(400.0,intrestAmount);

    }
}
