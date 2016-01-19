/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cpd4414.assignment.j.project;

import java.util.Random;
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

        System.out.println("testLessThanOneShouldReturnNull");
        String string = "";
        int power = 0;
        String expResult = null;
        String result = CPD4414AssignmentJProject.stringPower(string, power);
        assertEquals(expResult, result);
    }

    @Test
    public void testStringAndOneShouldReturnString() {

        System.out.println("testStringAndOneShouldReturnString");
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

        System.out.println("testStringAndTwoShouldReturnStringDoubled");
        String string = "Bob";
        int power = 2;
        String expResult = "BobBob";
        String result = CPD4414AssignmentJProject.stringPower(string, power);
        assertEquals(expResult, result);
    }

    @Test
    public void testStringAndRandomShouldReturnStringThatRandomNumberTimesMultiplied() {
        System.out.println("testStringAndRandomShouldReturnStringThatRandomNumberTimesMultiplied");
        String string = "test";
        int power = new Random().nextInt(9) + 3;

        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < power; i++) {
            builder.append(string);
        }

        String expResult = builder.toString();
        String result = CPD4414AssignmentJProject.stringPower(string, power);
        assertEquals(expResult, result);
    }

}
