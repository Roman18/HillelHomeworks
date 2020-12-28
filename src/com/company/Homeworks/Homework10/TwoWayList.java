package com.company.Homeworks.Homework10;

import java.util.Iterator;

public class TwoWayList<T> implements Iterable<T> {

    private Node head;
    private Node tail;
    private int size;

    private static class Node {
        Object value;
        Node next;
        Node prev;

        public Node(Object value) {
            this.value = value;
        }

        public Object getValue() {
            return value;
        }

        public void setValue(Object value) {
            this.value = value;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        public Node getPrev() {
            return prev;
        }

        public void setPrev(Node prev) {
            this.prev = prev;
        }
    }

    private class TwoWayListIterator implements Iterator<T> {
        Node cur = head;

        @Override
        public boolean hasNext() {
            return cur != null;
        }

        @Override
        public T next() {
            T val = (T) cur.value;
            cur = cur.next;
            return val;
        }
    }

    private class TwoWayListIteratorReverse implements Iterator<T> {
        Node cur = tail;

        @Override
        public boolean hasNext() {
            return cur != null;
        }

        @Override
        public T next() {
            T val = (T) cur.getValue();
            cur = cur.prev;
            return val;
        }
    }

    public void add(T t) {
        Node node = new Node(t);
        if (head == null) {
            head = tail = node;
        } else {
            node.prev = tail;
            tail.next = node;
            tail = node;
        }
        ++size;

    }

    public T get(int index) {
        checkIndex(index);
        Node cur = getNodeByIndex(index);
        return (T) cur.getValue();
    }

    public void remove(int index) {
        checkIndex(index);
        Node cur = getNodeByIndex(index);
        if (cur == head) {
            cur.next.prev=null;
            head=cur.next;
            cur.next=null;
        } else if (cur == tail) {
            cur.prev.next = null;
            tail=cur.prev;
            cur.prev=null;
        } else {
            cur.prev.next = cur.next;
            cur.next.prev = cur.prev;
        }
        --size;
    }

    public void set(int index, T value) {
        checkIndex(index);
        Node cur = getNodeByIndex(index);
        cur.setValue(value);
    }

    public int size() {
        return size;
    }

    private Node getNodeByIndex(int index) {
        Node cur = head;
        for (int i = 0; i < index; i++) {
            cur = cur.next;
        }
        return cur;
    }

    private Node getNodeByIndexReverse(int index) {
        Node cur = head;
        for (int i = size; i > index; i--) {
            cur = cur.prev;
        }
        return cur;
    }

    private void checkIndex(int index) {
        if (index < 0 || index >= size) throw new IndexOutOfBoundsException();
    }

    @Override
    public Iterator<T> iterator() {
        return new TwoWayListIterator();
    }

    public Iterator<T> iteratorReverse() {
        return new TwoWayListIteratorReverse();
    }
}
