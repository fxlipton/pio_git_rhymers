package edu.kis.vh.nursery;

import org.junit.Assert;
import org.junit.Test;

import edu.kis.vh.nursery.list.IntLinkedList;

public class IntLinkedListJUnitTest {

    @Test
    public void testPush() {
        IntLinkedList list = new IntLinkedList();
        list.push(1);
        Assert.assertFalse(list.isEmpty());
        Assert.assertEquals(1, list.top());
    }

    @Test
    public void testIsEmpty() {
        IntLinkedList list = new IntLinkedList();
        Assert.assertTrue(list.isEmpty());
        list.push(1);
        Assert.assertFalse(list.isEmpty());
    }

    @Test
    public void testIsFull() {
        IntLinkedList list = new IntLinkedList();
        Assert.assertFalse(list.isFull());
        list.push(1);
        Assert.assertFalse(list.isFull());
    }

    @Test
    public void testTop() {
        IntLinkedList list = new IntLinkedList();
        final int EMPTY_STACK_VALUE = -1;
        Assert.assertEquals(EMPTY_STACK_VALUE, list.top());
        list.push(1);
        Assert.assertEquals(1, list.top());
        list.push(2);
        Assert.assertEquals(2, list.top());
    }

    @Test
    public void testPop() {
        IntLinkedList list = new IntLinkedList();
        final int EMPTY_STACK_VALUE = -1;
        Assert.assertEquals(EMPTY_STACK_VALUE, list.pop());
        list.push(1);
        list.push(2);
        Assert.assertEquals(2, list.pop());
        Assert.assertEquals(1, list.pop());
        Assert.assertEquals(EMPTY_STACK_VALUE, list.pop());
    }

}
