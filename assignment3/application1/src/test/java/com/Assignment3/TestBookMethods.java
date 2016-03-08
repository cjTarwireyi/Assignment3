package com.Assignment3;

import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by student on 3/8/16.
 */
public class TestBookMethods {
    Book book = new Book("Programming","Cornelious");
    @Before
    public void setUp() throws Exception {


    }

    @Test
    public void testGetBookTitle() throws Exception {
        Assert.assertEquals(book.getBookTitle(),"Programming");
    }

    @Test
    public void testGetAuthor() throws Exception {
        Assert.assertEquals(book.getBookAuthor(),"Cornelious");
    }
}
