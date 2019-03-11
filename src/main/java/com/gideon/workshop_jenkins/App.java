package com.gideon.workshop_jenkins;

import static org.junit.Assert.assertTrue;
import java.util.*;
import org.junit.Test;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        System.out.println("peins");
/// asdasdasdhasdasdasasdasdasdasd
    }
    
    @Test
    public void dikkeLul() {
    	double result = 1 + 1;
    	assertTrue("berekening hoort 2 te zijn", result  > 2);
    }
    	
    @Test
    public void kleineLul() {
    	double result2 = 2 +2;
    	assertTrue("berekening hoort 4 te zijn", result2  > 4);
    
    }
}
