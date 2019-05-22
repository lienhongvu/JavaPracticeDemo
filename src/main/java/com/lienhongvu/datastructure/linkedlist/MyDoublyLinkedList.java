package com.lienhongvu.datastructure.linkedlist;

/**
 * Created by hvlien on 10/23/2018.
 */
public class MyDoublyLinkedList<T> implements MyLinkedList<T> {

    private Node<T> head;
    private Node<T> tail;

    private int size = 0;

    public MyDoublyLinkedList() {
        head = null;
        tail = null;
    }

    @Override
    public boolean isEmpty() {
        return head == null;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void add(T value) {
        if (isEmpty()) {
            head = new Node<>(value, null, null);
            tail = head;
        } else {
            Node<T> node = new Node<>(value, tail, null);
            tail.setRight(node);
            tail = node;
        }
        size++;
    }

    @Override
    public void addFirst(T item) {
        if(isEmpty()){
            head = new Node<>(item, null, null);
            tail = head;
        } else {
            Node<T> oldFirstNode = head;
            head = new Node<>(item, null, oldFirstNode);
            oldFirstNode.setLeft(head);
        }
        size++;
    }

    @Override
    public void addLast(T item) {
        if(isEmpty()){
            head = new Node<>(item, null, null);
            tail = head;
        } else {
            Node<T> oldLastNode = tail;
            tail = new Node<>(item, oldLastNode, null);
            oldLastNode.setRight(tail);
        }
        size++;
    }

    @Override
    public void addAfter(T item, T after) {
        if(isEmpty()) return;

        Node<T> temp = head;
        while (temp != null){
            if(temp.getValue().equals(after)
                    && temp.getRight() != null){
                Node<T> oldRightNode = temp.getRight();
                temp.setRight(new Node<>(item, temp, oldRightNode));
                size++;
                break;
            }
            temp = temp.getRight();
        }
    }

    @Override
    public void delete(T item) {

    }

    @Override
    public void deleteFirst() {

    }

    @Override
    public void deleteLast() {

    }

    @Override
    public void deleteAfter(T item) {

    }

    @Override
    public String displayForward() {
        final StringBuilder sb = new StringBuilder();
        if (isEmpty()) return sb.toString();

        sb.append(head.getValue());

        Node<T> temp = head.getRight();
        while (temp != null) {
            sb.append(" " + temp.getValue());
            temp = temp.getRight();
        }

        return sb.toString();
    }

    @Override
    public String displayBackward() {
        final StringBuilder sb = new StringBuilder();
        if (isEmpty()) return sb.toString();

        sb.append(tail.getValue());

        Node<T> temp = tail.getLeft();
        while (temp != null) {
            sb.append(" " + temp.getValue());
            temp = temp.getLeft();
        }

        return sb.toString();
    }

    class Node<T> {
        private T value;
        private Node<T> left;
        private Node<T> right;

        public Node() {
        }

        public Node(T value, Node<T> left, Node<T> right) {
            this.value = value;
            this.left = left;
            this.right = right;
        }

        public T getValue() {
            return value;
        }

        public void setValue(T value) {
            this.value = value;
        }

        public Node<T> getLeft() {
            return left;
        }

        public void setLeft(Node<T> left) {
            this.left = left;
        }

        public Node<T> getRight() {
            return right;
        }

        public void setRight(Node<T> right) {
            this.right = right;
        }
    }
}
