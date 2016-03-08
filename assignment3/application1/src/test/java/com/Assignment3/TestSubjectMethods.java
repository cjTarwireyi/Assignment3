package com.Assignment3;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by student on 3/8/16.
 */
public class TestSubjectMethods {
    Subject subject = new Subject("Programming","P002");

    @Before
    public void setUp() throws Exception {


    }

    @Test
    public void testGetSubjectName() throws Exception {
        Assert.assertEquals(subject.getSubjectName(),"Programming");
    }

    @Test
    public void testGetSubjectCode() throws Exception {
        Assert.assertEquals(subject.getSubjectCode(),"P002");
    }
}
