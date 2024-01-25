package Exercise.Ex13;

import java.util.NoSuchElementException;



public class MyLinkedList<E> {
    private int numNodes;
    private Node<E> head;

    public MyLinkedList() {
        this.numNodes = 0;
        this.head = null;
    }

    public void add(int index, E element) {
        if (index < 0 || index > numNodes) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + numNodes);
        }


        Node<E> newNode = new Node<>(element);
        if (index == 0) {
            newNode.setNext(head);
            head = newNode;
        } else {
            Node current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.getNext();
            }
            newNode.setNext(current.getNext());
            current.setNext(newNode);
        }

        numNodes++;
    }


    public void addFirst(E data) {
        Node newNode = new Node(data);
        newNode.setNext(head);
        head = newNode;
        numNodes++;
    }

    public void addLast(E data) {
        add(data);
    }

    public void remove(int index) {
        if (index < 0 || index >= numNodes) {
            throw new IndexOutOfBoundsException("Invalid index");
        }

        if (index == 0) {
            head = head.getNext();
        } else {
            Node current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.getNext();
            }
            current.setNext(current.getNext().getNext());
        }
        numNodes--;
    }

    public void remove(E data) {
        Node current = head;
        Node previous = null;

        while (current != null && !current.getData().equals(data)) {
            previous = current;
            current = current.getNext();
        }

        if (current != null) {
            if (previous == null) {
                head = current.getNext();
            } else {
                previous.setNext(current.getNext());
            }
            numNodes--;
        }
    }

    public E get(int index) {
        if (index < 0 || index >= numNodes) {
            throw new IndexOutOfBoundsException("Invalid index");
        }

        Node current = head;
        for (int i = 0; i < index; i++) {
            current = current.getNext();
        }

        return (E) current.getData();
    }

    public int size() {
        return numNodes;
    }

    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.getData() + " ");
            current = current.getNext();
        }
        System.out.println();
    }

    public MyLinkedList<E> clone() {
        MyLinkedList<E> newList = new MyLinkedList<>();
        Node current = head;
        while (current != null) {
            newList.add(current.getData());
            current = current.getNext();
        }
        return newList;
    }

    public boolean contains(E data) {
        Node current = head;
        while (current != null) {
            if (current.getData().equals(data)) {
                return true;
            }
            current = current.getNext();
        }
        return false;
    }

    public int indexOf(E data) {
        Node current = head;
        int index = 0;
        while (current != null) {
            if (current.getData().equals(data)) {
                return index;
            }
            current = current.getNext();
            index++;
        }
        return -1;
    }
}
