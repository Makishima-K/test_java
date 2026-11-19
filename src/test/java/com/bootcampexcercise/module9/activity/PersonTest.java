package com.bootcampexcercise.module9.activity;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PersonTest {

    private Person person;

    @Before
    public void setUp() throws Exception {
        // Initialize person object before each test
        person = new Person();
    }

    @After
    public void tearDown() throws Exception {
        // Tear down person object after each test
        person = null;
    }

    @Test
    public void testGettersAndSetters() {
        person.setWeight(70);
        assertEquals(70, person.getWeight());

        person.setHeight(1.75f);
        assertEquals(1.75f, person.getHeight(), 0.0001f);
    }

    @Test
    public void testGetBodyMassIndex() {
        // Valid BMI categories
        assertEquals("Underweight", person.getBodyMassIndex(50, 1.80));    // BMI ~15.4
        assertEquals("Normal weight", person.getBodyMassIndex(70, 1.75));  // BMI ~22.9
        assertEquals("Overweight", person.getBodyMassIndex(85, 1.75));     // BMI ~27.8
        assertEquals("Obese", person.getBodyMassIndex(100, 1.75));         // BMI ~32.7

        // Category boundaries (height 1.0 makes BMI equal to weight)
        assertEquals("Underweight", person.getBodyMassIndex(18.4, 1.0));
        assertEquals("Normal weight", person.getBodyMassIndex(18.5, 1.0));
        assertEquals("Normal weight", person.getBodyMassIndex(24.9, 1.0));
        assertEquals("Overweight", person.getBodyMassIndex(25, 1.0));
        assertEquals("Overweight", person.getBodyMassIndex(29.9, 1.0));
        assertEquals("Obese", person.getBodyMassIndex(30, 1.0));

        // Invalid inputs: zero and negative values
        assertEquals("Invalid input", person.getBodyMassIndex(0, 1.75));
        assertEquals("Invalid input", person.getBodyMassIndex(-70, 1.75));
        assertEquals("Invalid input", person.getBodyMassIndex(70, 0));
        assertEquals("Invalid input", person.getBodyMassIndex(70, -1.75));

        // Invalid inputs: weight > 600 and height > 3.0
        assertEquals("Invalid input", person.getBodyMassIndex(600.1, 1.75));
        assertEquals("Invalid input", person.getBodyMassIndex(70, 3.01));

        // Upper limits are still valid: weight 600 and height 3.0
        assertEquals("Obese", person.getBodyMassIndex(600, 1.75));
        assertEquals("Underweight", person.getBodyMassIndex(70, 3.0));
    }
}
