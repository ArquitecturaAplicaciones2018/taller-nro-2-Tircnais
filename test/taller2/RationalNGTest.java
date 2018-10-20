/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller2;

import static org.testng.Assert.*;
import org.testng.annotations.Test;

/**
 *
 * @author Cristian
 */
public class RationalNGTest {
    /**
     * Test of isLessThan method, of class Rational.
     */
    @Test
    public void testIsLessThan() {
        System.out.println("isLessThan");
        Rational a = new Rational(3, 4);
        Rational b = new Rational(6, 2);
        boolean expResult = a.isLessThan(b);
        assertTrue(expResult);
        // TODO review the generated test code and remove the default call to fail.
        //
    }

    /**
     * Test of getGreater method, of class Rational.
     */
    @Test
    public void testGetGreater() {
        System.out.println("getGreater");
        Rational a = new Rational(3, 4);
        Rational b = new Rational(6, 2);
        String expResult = a.getGreater(b).toString();
        String result = "3";
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        //
    }

    /**
     * Test of plus method, of class Rational.
     */
    @Test
    public void testPlus() {
        System.out.println("plus");
        Rational a = new Rational(3, 4);
        Rational b = new Rational(6, 2);
        String expResult = a.plus(b).toString();
        String result = "15/4";
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of minus method, of class Rational.
     */
    @Test
    public void testMinus() {
        System.out.println("minus");
        Rational a = new Rational(3, 4);
        Rational b = new Rational(6, 2);
        String expResult = a.minus(b).toString();
        String result = "9/-4";
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of times method, of class Rational.
     */
    @Test
    public void testTimes() {
        System.out.println("times");
        Rational a = new Rational(3, 4);
        Rational b = new Rational(6, 2);
        String expResult = a.times(b).toString();
        String result = "9/4";
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of divides method, of class Rational.
     * En caso de que el denominador sea 0 la excepcion lo captura y la evalua como Metodo valido
     */
    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testDivides() {
        System.out.println("divides");
        Rational a = new Rational(3, 4);
        Rational b = new Rational(6, 0); //6/2
        String expResult = a.divides(b).toString();
        String result = "1/4";
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of toString method, of class Rational.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Rational instance = new Rational(3, 4);
        String expResult = "3/4";
        String result = instance.toString();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}
