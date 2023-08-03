package com.github.zipcodewilmington.mylinkedlist;

import java.util.Objects;

public class MyLinkedList {

    MyNode head;

    public MyLinkedList(String key) {
        head = new MyNode(key, null);
    }

    public MyNode getHead() {
        return head;
    }

    public MyNode get(String key) {
        MyNode currentNode = head;
        while(currentNode != null) {
            if(currentNode.getData().getKey().equals(key)) {
                return currentNode;
            }
            currentNode = currentNode.getNext();
        }
        return null;
    }

    public void add(String key, Integer value) {
        MyNode currentNode = head;
        while(currentNode.getNext() != null) {
            currentNode = currentNode.getNext();
        }
        currentNode.setNext(new MyNode(key, value));
    }

    public boolean isEmpty() {
        return head.getNext() == null;
    }

    public Integer remove(String key) {
        MyNode previousNode = head;
        MyNode currentNode = head.getNext();
        while(currentNode != null && !currentNode.getData().getKey().equals(key)) {
            previousNode = currentNode;
            currentNode = currentNode.getNext();
        }
        if(currentNode == null) {
            return null;
        }
        previousNode.setNext(currentNode.getNext());
        return currentNode.getData().getValue();
    }

    public int size() {
        MyNode currentNode = head;
        int counter = 1;
        while(currentNode.getNext() != null) {
            currentNode = currentNode.getNext();
            counter++;
        }
        return counter;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyLinkedList that = (MyLinkedList) o;
        return Objects.equals(head, that.head);
    }

}
