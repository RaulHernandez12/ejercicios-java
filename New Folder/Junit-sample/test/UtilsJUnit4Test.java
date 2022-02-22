/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Ignore;
import sample.Utils;

/**
 *
 * @author Raul
 */
public class UtilsJUnit4Test {
    
    public UtilsJUnit4Test() {
    }
    
    
    @BeforeClass
    public static void setUpClass() throws Exception {
        System.out.println("* UtilsJUnit4Test: @BeforeClass method");
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
        System.out.println("* UtilsJUnit4Test: @AfterClass method");
    }
    
    @Before
    public void setUp() {
        System.out.println("* UtilsJUnit4Test: @Before method");
        }
    @After
    public void tearDown() {
        System.out.println("* UtilsJUnit4Test: @After method");
    }

  
  @Test
    public void helloWorldCheck() {
        System.out.println("* UtilsJUnit4Test: test method 1 - helloWorldCheck()");
        assertEquals("Hello, world!", Utils.concatWords("Hello", ", ", "world", "!"));
        assertEquals("Hola, mundo!", Utils.concatWords("Hola", ", ", "mundo", "!"));
        assertEquals("Vamos al futbol!", Utils.concatWords("Vamos ", "al ", "futbol", "!"));
        assertNotSame("Hello, world!", Utils.concatWords("", ", ", "world", "!"));
        assertNotSame("Hello, world!", Utils.concatWords("vamos", ", ", "world", "!",""));
    }


 @Test (timeout=10000)
    public void testWithTimeout() {
        System.out.println("* UtilsJUnit4Test: test method 2 - testWithTimeout()");
        final int factorialOf = 1 + (int) (30000 * Math.random());
        System.out.println("computing " + factorialOf + '!');
        System.out.println(factorialOf + "! = " + Utils.computeFactorial(factorialOf));
    }
    
    @Test (expected=IllegalArgumentException.class)
        public void checkExpectedException() {
        System.out.println("* UtilsJUnit4Test: test method 3 - checkExpectedException()");
        final int factorialOf = -5;
        System.out.println(factorialOf + "! = " +Utils.computeFactorial(factorialOf));
    }
    
   
    @Test
       public void temporarilyDisabledTest() throws Exception {
        System.out.println("* UtilsJUnit4Test: test method 4 - checkExpectedException()");
        assertEquals("Malm\u00f6", Utils.normalizeWord("Malmo\u0308"));
    }

    
}
