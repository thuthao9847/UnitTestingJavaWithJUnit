/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import homeworktrixie.Stack;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ThuThao
 */
public class StackTest {
    @Test
    public void isEmptyTest(){
        Stack stack = new Stack();
        assertTrue(stack.isEmpty());
    }
    @Test
    public void pushTest(){
        Stack stack = new Stack();
        stack.push(16);
        int actual = stack.peek();
        assertEquals(16, actual);
    }
    @Test
    public void popTest(){
        Stack stack = new Stack();
        stack.push(16);
        assertEquals(16, stack.pop());
    }
    @Test
    public void peekTest(){
        Stack stack = new Stack();
        stack.push(16);
        assertEquals(16, stack.peek());
    }
    @Test
    public void clearTest(){
        Stack stack = new Stack();
        stack.push(16);
        stack.clear();
        assertEquals( null,stack.root);
    }
    @Test
    public void containTest(){
        Stack stack = new Stack();
        stack.push(16);
        assertTrue(stack.contain(16));
    }
}
