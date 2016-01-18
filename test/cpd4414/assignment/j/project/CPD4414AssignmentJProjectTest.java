/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cpd4414.assignment.j.project;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author macbook
 */
public class CPD4414AssignmentJProjectTest {

    public CPD4414AssignmentJProjectTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testEmptyStringShouldReturnEmptyString() {

        System.out.println("testEmptyStringShouldReturnEmptyString");
        String string = "";
        int power = 3;
        String expResult = "";
        String result = CPD4414AssignmentJProject.stringPower(string, power);
        assertEquals(expResult, result);
    }

    @Test
    public void testLessThanOneShouldReturnNull() {

        System.out.println("stringPower");
        String string = "";
        int power = 0;
        String expResult = null;
        String result = CPD4414AssignmentJProject.stringPower(string, power);
        assertEquals(expResult, result);
    }

    @Test
    public void testStringAndOneShouldReturnString() {

        System.out.println("stringPower");
        String string = "String";
        int power = 1;
        String expResult = "String";
        String result = CPD4414AssignmentJProject.stringPower(string, power);
        assertEquals(expResult, result);
    }

    /**
     *
     */
    @Test
    public void testStringAndTwoShouldReturnStringDoubled() {

        System.out.println("stringPower");
        String string = "Bob";
        int power = 2;
        String expResult = "BobBob";
        String result = CPD4414AssignmentJProject.stringPower(string, power);
        assertEquals(expResult, result);
    }
    
    

}
