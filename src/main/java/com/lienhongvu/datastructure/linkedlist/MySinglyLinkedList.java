package com.lienhongvu.datastructure.linkedlist;


import java.util.Objects;

/**
 * Created by hvlien on 10/1/2018.
 */
public class MySinglyLinkedList<T> {

    private Node<T> head, tail;
    private long size;

    public MySinglyLinkedList() {
        head = null;
        size = 0;
    }

    public Node<T> getFirst() {
        return head;
    }

    public long size() {
        return this.size;
    }

    public void add(T item) {
        Node<T> node = new Node<>();
        node.setItem(item);
        if (Objects.isNull(head)) {
            head = node;
            tail = node;
        } else {
            tail.setNext(node);
            tail = node;
        }
        size++;
    }

    public void addAfter(T item, T after) {
        if (head == null) return;

        Node<T> temp = head;
        boolean isAdded = false;
        while (temp != null && temp.getItem() != null) {
            if (temp.getItem().toString().equals(after)) {
                temp.setNext(new Node<>(item, temp.getNext()));
                size++;
                isAdded = true;
                break;
            }
            temp = temp.getNext();
        }
        if (!isAdded) System.out.println("Can't find {" + after + "} in List");
    }

    public void deleteFront() {
        if (Objects.isNull(head)) return;

        head = head.getNext();
        tail = head;
        size--;
    }

    public void deleteOneAfter(T value) {
        if (Objects.isNull(head)) return;

        Node<T> temp = head;
        while (temp != null && temp.getItem() != null) {

            if (temp.getItem().equals(value) && temp.getNext() != null) {
                if (temp.getNext().getNext() != null) {
                    temp.setNext(temp.getNext().getNext());
                } else {
                    temp.setNext(null);
                }
                size--;
            }
            temp = temp.getNext();
        }
    }

    public void deleteAllAfter(T value) {
        if (Objects.isNull(head)) return;

        Node<T> temp = head;
        while (temp != null && temp.getItem() != null) {
            if (temp.getItem().equals(value)) {
                temp.setNext(null);
            }
            temp = temp.getNext();
        }
        changeSize();
    }

    private void changeSize() {
        if (Objects.isNull(head)) return;

        size = 0;
        Node<T> temp = head;
        while (temp != null && temp.getItem() != null) {
            size++;
            temp = temp.getNext();
        }
    }

    public void deleteValue(T value) {
        if (Objects.isNull(head)) return;

        Node<T> temp = head;
        Node<T> previousNode = head;
        while (temp != null && temp.getItem() != null) {

            if (temp.getItem().equals(value)) {
                if (size == 1) {
                    head = null;
                } else if (temp.getNext() == null) {
                    previousNode.setNext(null);
                    size--;
                    break;
                } else {
                    previousNode.setNext(temp.getNext());
                    temp = previousNode;
                }
                size--;
            }
            previousNode = temp;
            temp = temp.getNext();
        }
    }

    public void clear() {
        head = null;
        size = 0;
    }

    @Override
    public String toString() {
        if (Objects.isNull(head)) return "";

        StringBuilder sb = new StringBuilder();
        sb.append(head.getItem());
        Node<T> temp = head;
        while (temp.getNext() != null) {
            temp = temp.getNext();
            sb.append(" " + temp.getItem());
        }
        return sb.toString();
    }

    class Node<T> {
        private T item;
        private Node<T> next;

        public Node() {
        }

        public Node(T item, Node<T> next) {
            this.item = item;
            this.next = next;
        }

        public T getItem() {
            return item;
        }

        public void setItem(T item) {
            this.item = item;
        }

        public Node<T> getNext() {
            return next;
        }

        public void setNext(Node<T> next) {
            this.next = next;
        }
    }
}

