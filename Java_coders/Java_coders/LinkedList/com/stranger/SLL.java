package com.stranger;

// Singly Linked List
public class SLL {

    private Node head;
    private Node tail;
    private  int size;
    public SLL() {
        this.size = 0;
    }

    // create a node that having its value and point to next node
    private class Node {
        private int value;
        private Node next;
        public Node(int value) {
            this.value = value;
        }
        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    // insert first element in the node
    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;
        if (tail == null) tail = head;
        size += 1;
    }

    // insert last element in the node
    public void insertLast(int val) {
        if(tail == null) {
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }

    // insert a element at a specific index
    public void insert(int val, int index) {
        if(index == 0) {
            insertFirst(val);
            return;
        }
        if(index == size) {
            insertLast(val);
            return;
        }
        Node temp = head;
        for (int i = 1; i < index; i++) temp = temp.next;

        Node node = new Node(val, temp.next);
        temp.next = node;

        size++;
    }

    // delete first element
    public int deleteFirst() {
        int val = head.value;
        head = head.next;
        if(head == null) tail = null;
        size --;
        return val;
    }

    // get the reference pointer of that node
    public Node get(int index) {
        Node node = head;
        for (int i = 0; i < index; i++) node = node.next;
        return node;
    }

    // delete the last element
    public int deleteLast() {
        if(size <= 1) deleteFirst();

        Node secLast = get(size - 2);
        int val = tail.value;
        tail = secLast;
        tail.next = null;
        size--;
        return val;
    }

    // find the element
    public Node find(int val) {
        Node node = head;
        while (node != null) {
            if(node.value == val) return node;
            node = node.next;
        }
        return null;
    }

    // delete the element through its index
    public int delete(int index) {
        if(index == 0) deleteFirst();
        if(index == size - 1) deleteLast();

        Node pv = get(index - 1);
        int val = pv.next.value;
        pv.next = pv.next.next;
        size--;
        return val;
    }

    // display all the nodes
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.print("END");
    }


}
