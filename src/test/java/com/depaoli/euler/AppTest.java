package com.depaoli.euler;

import static org.junit.Assert.assertTrue;

import org.junit.*;

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
    public void test_p003_result()
    {
          
        final int expected = 6857;        
            
        long n = 600851475143L;

        final long actual = p003.largestFactor(n);        
        // Assert
        Assert.assertEquals(actual, expected); 
    } 

    @Test
    public void test_p021_result()
    {
          
        final int expected = 31626;        
            

        final int actual = p021.evaluateSum(0);     
           
        Assert.assertEquals(actual, expected); 
    } 

    @Test
    public void test_p067_result()
    {
          
        final int expected = 7273;        
            
        final String actual = p067.MaxPathSum();
        
        Assert.assertEquals(Integer.parseInt(actual), expected); 
    } 

}
