/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package claseabstracta;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Raul
 */
public class ProfesorTest {
    
    public ProfesorTest() {
    }

    /**
     * Test of getSalario method, of class Profesor.
     */
    @Test
    public void testGetSalario() {
        System.out.println("getSalario");
        Profesor instance = new Profesor();
        double expResult = 0.0;
        double result = instance.getSalario();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDepartamento method, of class Profesor.
     */
    @Test
    public void testGetDepartamento() {
        System.out.println("getDepartamento");
        Profesor instance = new Profesor();
        String expResult = "";
        String result = instance.getDepartamento();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSalario method, of class Profesor.
     */
    @Test
    public void testSetSalario() {
        System.out.println("setSalario");
        double salario = 0.0;
        Profesor instance = new Profesor();
        instance.setSalario(salario);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDepartamento method, of class Profesor.
     */
    @Test
    public void testSetDepartamento() {
        System.out.println("setDepartamento");
        String departamento = "";
        Profesor instance = new Profesor();
        instance.setDepartamento(departamento);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Mostrar method, of class Profesor.
     */
    @Test
    public void testMostrar() {
        System.out.println("Mostrar");
        Profesor instance = new Profesor();
        instance.Mostrar();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
