//In order to use JUnit testing, we'll need to put the following imports into our class

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class JunitTesting {
    //TODO:The @Test Annotation
    //The @Test annotation tells JUnit that the public void method to which it is attached can be run as a test case.

    //TODO:assertEquals
    //The assertEquals assertion verifies that the expected, and the actual values are equal:

    @Test
    public void testIfMyNameIsEquals() {
        String expected = "Yasin";
        String actual = "Yasin";

        assertEquals(expected,actual);
    }

    @Test
    public void testIfChangeIsCorrect(){
        Double price = 10.0;
        Double discount = 4.5;

        assertEquals(5.5,price - discount, 0);
        assertEquals(5.1, price - discount, 0.5);
        assertNotEquals(4.9, price - discount, 0.5);
    }

    //TODO: assertNotSame,
    //it's possible to verify if two variables don't refer to the same object.
    @Test
    public void testIfObjectAreDifferent() {
        Object dog = new Object();
        Object sheep = new Object();
        Object clonnedSheep = sheep;

        assertNotSame(sheep,dog);
        assertSame(sheep,clonnedSheep);
    }

    //TODO:assertArrayEquals
    //The assertArrayEquals method checks that two object arrays are equal or not. If they are not, it throws an AssertionError.

    @Test
    public void testIfArrayEquals() {
        char[] expected = {'J','u','n','i','t'};
        char[] actual = "Junit".toCharArray();

        assertArrayEquals(expected,actual);
    }

    @Test
    public void IfArrayEquals() {
        int[] numbers = {1,2,3};
        int[] otherNumbers = new int[3];
        otherNumbers[0] = 1;
        otherNumbers[1] = 2;
        otherNumbers[2] = 3;

        assertArrayEquals(numbers,otherNumbers);
    }

    //TODO:assertTrue and assertFalse
    //In case we want to verify that a certain condition is true or false.
    @Test
    public void testIfGreaterOrLesserThanWorks() {
        boolean learningTDD = true;

        assertTrue(learningTDD);
        assertFalse("5 is not greater than 6",5 > 6);
        assertTrue("3 is greater than 2", 3>2);
    }

    //TODO:assertNull and assertNotNull
    //The following methods are useful to check if an object has been instantiated or not.
    private String device;

    @Test
    public void testIfInstanceIsNull() {
        Device phone = new Device();
        Device laptop = null;
        assertNull(null);
        assertNotNull(phone);
    }

    //TODO:Before
    //Annotating a public void method with @Before causes that method to be run before the @Test method

    private List<String> names;

    @Before
    public void setUp() {
        this.names = new ArrayList<>();
        this.names.add("Yasin");
    }

    // We can verify that the names list is not longer null because it was initialized in the setUp() method with the following test:
    @Test
    public void  testIfNamesIsInitialized() {
        assertNotNull(names);
    }

    @Test
    public void testIfANameCanBeAdded() {
        assertEquals(1, this.names.size());
        this.names.add("Raika");
        assertEquals(2,this.names.size());
        assertSame("Yasin",names.get(0));
        assertSame("Raika",names.get(1));
    }


}
