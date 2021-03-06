package br.noelen;

import org.junit.Test;

import static org.junit.Assert.*;

import org.junit.Before;

public class StackTest {
    private Stack p;

    @Before
    public void setup() {
        p = new Stack(3);
    }

    @Test
    public void testEmptyStack() {
        boolean empty = p.isEmpty();
        assertTrue("New stack should be empty", empty);
    }

    @Test
    public void testPush() {
        p.push(1);
        boolean condition = p.isEmpty();
        assertFalse("After insertion, stack should not be empty", condition);
    }

    @Test
    public void testPeek() {
        p.push(1);
        p.push(2);
        int resp = p.peek();
        assertEquals("The value after two insertions, should be 2", 2, resp);
    }

    public void testIsFull() {
        p.push(1);
        p.push(2);
        p.push(3);

        boolean full = p.isfull();
        assertTrue("The stack should be full", full);
    }

    @Test
    public void testPop() {
        p.push(1);
        p.push(2);

        int value1 = p.pop();
        int value2 = p.pop();

        assertEquals("Removing the first element should be 2", 2, value1);
        assertEquals("to remove the second element should be 1", 1, value2);
        boolean empty = p.isEmpty();
        assertTrue("New stack should be empty", empty);
    }
}
