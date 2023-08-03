package com.github.zipcodewilmington.mylinkedlist;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyLinkedListTest {

    @Test
    void add() {
        //Given
        MyLinkedList list = new MyLinkedList("hello");
        String expectedKey = "bye";
        Integer expectedValue = 34;
        MyNode expected = new MyNode(expectedKey, expectedValue);
        //When
        list.add(expectedKey, expectedValue);
        MyNode actual = list.getHead().getNext();
        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    void remove() {
        //Given
        MyLinkedList list = new MyLinkedList("hello");
        String expectedKey = "hi";
        Integer expectedValue = 4;
        list.add(expectedKey, expectedValue);
        //When
        Integer actualValue = list.remove(expectedKey);
        //Then
        Assert.assertEquals(expectedValue, actualValue);
        Assert.assertEquals(true, list.isEmpty());
    }

    @Test
    void size() {
        //Given
        int expected = 2;
        MyLinkedList list = new MyLinkedList("hello");
        list.add("hi", 2);
        //When
        int actual = list.size();
        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    void getTest() {
        //Given
        MyLinkedList list = new MyLinkedList("hello");
        list.add("bye", 2);
        MyNode expected = new MyNode("bye", 2);
        //When
        MyNode actual = list.get("bye");
        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void isEmptyTest() {
        MyLinkedList list = new MyLinkedList("hi");
        //When
        boolean actual = list.isEmpty();
        //Then
        Assert.assertEquals(true, actual);
    }

    @Test
    public void isNotEmptyTest() {
        MyLinkedList list = new MyLinkedList("hi");
        //When
        boolean actual = list.isEmpty();
        //Then
        Assert.assertEquals(true, actual);
    }
}