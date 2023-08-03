package com.github.zipcodewilmington.mylinkedlist;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyPairTest {

    @Test
    void setKey() {
        //Given
        String expected = "blah";
        MyPair myPair = new MyPair("hi", 2);
        //When
        myPair.setKey(expected);
        String actual = myPair.getKey();
        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    void setValue() {
        //Given
        Integer expected = 5;
        MyPair myPair = new MyPair("hi", 2);
        //When
        myPair.setValue(expected);
        Integer actual = myPair.getValue();
        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    void testEquals() {
        MyPair one = new MyPair("key", 0);
        MyPair two = new MyPair("key", 0);
        Assert.assertEquals(one, two);
    }
}