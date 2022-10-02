package org.lab;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClassroomTest {

    @Test
    void addition() {
        assertEquals(15, Classroom.addition(6,9));
    }

    @Test
    void subtraction() {
        assertEquals(-3, Classroom.subtraction(6,9));
    }

    @Test
    void multiplication() {
        assertEquals(54, Classroom.multiplication(6,9));
    }

    @Test
    void division() {
        assertEquals(4.0, Classroom.division(20,5));
    }

    @Test
    void power() {
        assertEquals(125, Classroom.power(5,3));
    }


}