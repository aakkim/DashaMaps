package com.github.zipcodewilmington.mylinkedlist;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyNodeTest {

    @Test
    void testSetNext() {
        //Given
        MyNode one = new MyNode("hi", 2);
        MyNode two = new MyNode("bye", 4);
        //When
        one.setNext(two);
        //Then
        Assert.assertEquals(two, one.getNext());
    }

    @Test
    void testEquals() {
        //Given
        MyNode one = new MyNode("hi", 2);
        MyNode two = new MyNode("hi", 2);
        //When
        //Then
        Assert.assertEquals(one, two);
    }
}