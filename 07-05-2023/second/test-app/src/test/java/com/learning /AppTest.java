package com.learning ;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Test
    public void testSum() {

        // execute 
        com.learning.App app = new com.learning.App();
        int sum = app.sum(2,3);

        // verify
        assertEquals(5, sum);
    }
}
