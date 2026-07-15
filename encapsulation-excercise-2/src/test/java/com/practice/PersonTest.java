package com.practice;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PersonTest {

    @Test
   public void ageShouldBeStoredCorrectly() {

        Person person = new Person();

        person.setAge(25);

        assertEquals(25, person.getAge());
    }

    @Test
    public void ageShouldNotAllowNegativeNumbers() {

        Person person = new Person();

        person.setAge(25);
        person.setAge(-5);

        assertEquals(25, person.getAge());
    }

    @Test
    public void ageShouldNotAllowUnrealisticValues() {

        Person person = new Person();

        person.setAge(30);
        person.setAge(200);

        assertEquals(30, person.getAge());
    }

}