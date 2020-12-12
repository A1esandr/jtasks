package main;

public class SingleLinkedList<T> {
    private Node root;

    private class Node {
        private T value;
        private Node next;
    }

    SingleLinkedList() {
        this.root = new Node();
    }

    public void add(T value) {
        return;
    }
}
