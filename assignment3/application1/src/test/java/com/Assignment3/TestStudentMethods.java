package com.Assignment3;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by student on 3/8/16.
 */
public class TestStudentMethods {
    Student student = new Student("Cornelious","Tarwireyi");
    @Before
    public void setUp() throws Exception {


    }

    @Test
    public void testGetName() throws Exception {

        Assert.assertEquals(student.getName(),"Cornelious");
    }

    @Test
    public void testgetSurname() throws Exception {
        Assert.assertEquals(student.getSurname(),"Tarwireyi");
    }
}
