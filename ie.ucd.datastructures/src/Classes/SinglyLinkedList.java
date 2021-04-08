package Classes;

import Interfaces.List;

import java.util.Iterator;

/**
 * A basic singly linked list implementation.
 */
public class SinglyLinkedList<E> implements Cloneable, Iterable<E>, List<E> {
    public E removeLast() {
        return null;
    }
    //---------------- nested Node class ----------------

    /**
     * Node of a singly linked list, which stores a reference to its
     * element and to the subsequent node in the list (or null if this
     * is the last node).
     */
    private static class Node<E> {
        private E element;
        private Node<E> next;

        public Node(E e, Node<E> n) {
            element = e;
            next = n;
        }

    }
    //----------- end of nested Node class -----------

    // instance variables of the Classes.SinglyLinkedList
    private Node<E> head = null; // head node of the list (or null if empty)

    private Node<E> tail = null; // tail node of the list (or null if empty)

    private int size = 0; // number of nodes in the list

    public SinglyLinkedList() {
    }              // constructs an initially empty list

    // access methods

    /**
     * Returns the number of elements in the linked list.
     *
     * @return number of elements in the linked list
     */
    public int size() {
        return size;
    }

    /**
     * Tests whether the linked list is empty.
     *
     * @return true if the linked list is empty, false otherwise
     */
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public E get(int i) throws IndexOutOfBoundsException {
        return null;
    }

    @Override
    public E set(int i, E e) throws IndexOutOfBoundsException {
        return null;
    }

    @Override
    public void add(int i, E e) throws IndexOutOfBoundsException {

    }

    @Override
    public E remove(int i) throws IndexOutOfBoundsException {
        return null;
    }

    /**
     * Returns (but does not remove) the first element of the list
     *
     * @return element at the front of the list (or null if empty)
     */
    public E first() {
        if (isEmpty()) {
            return null;
        }
        return head.element;
    }

    /**
     * Returns the last node of the list
     *
     * @return last node of the list (or null if empty)
     */
    public Node<E> getLast() {
        return tail;
    }

    /**
     * Returns (but does not remove) the last element of the list.
     *
     * @return element at the end of the list (or null if empty)
     */
    public E last() {
        if (isEmpty()){
            return null;
        }
        return tail.element;
    }

    // update methods

    /**
     * Adds an element to the front of the list.
     *
     * @param e the new element to add
     */
    public void addFirst(E e) {
        head = new Node<>(e, head);
        if (size == 0) {
            tail = head;
        }
        size++;
    }

    /**
     * Adds an element to the end of the list.
     *
     * @param e the new element to add
     */
    public void addLast(E e) {
        Node<E> newNode = new Node<>(e, null);
        if (isEmpty()) {
            head = newNode;
        }else {
            tail.next=newNode;
        }
        tail = newNode;
        size++;

    }

    /**
     * Removes and returns the first element of the list.
     *
     * @return the removed element (or null if empty)
     */
    public E removeFirst() {
        if (isEmpty()){
            return null;
        }
        E node = head.element;
        head = head.next;
        size--;
        if (size == 0) {
            tail = null;
        }
        return node;
    }

    @SuppressWarnings({"unchecked"})
    public boolean equals(Object o) {
        if (o == null){
            return false;
        }
        if (getClass() != o.getClass()) {
            return false;
        }
        SinglyLinkedList<E> other = (SinglyLinkedList<E>) o;
        if (size != other.size) {
            return false;
        }
        Node<E> walkA = head;
        Node<E> walkB = other.head;
        while (walkA != null) {
            if (!walkA.element.equals(walkB.element)){
                return false; //mismatch
            }
            walkA = walkA.next;
            walkB = walkB.next;
        }
        return true;
    }

    @SuppressWarnings({"unchecked"})
    public SinglyLinkedList<E> clone() throws CloneNotSupportedException {
        // always use inherited Object.clone() to create the initial copy
        SinglyLinkedList<E> other = (SinglyLinkedList<E>) super.clone(); // safe cast
        if (size > 0) {                    // we need independent chain of nodes
            other.head = new Node<E>(head.element, null);
            Node<E> walk = head.next;      // walk through remainder of original list
            Node<E> otherTail = other.head;     // remember most recently created node
            while (walk != null) {              // make a new node storing same element
                Node<E> newNode = new Node<E>(walk.element, null);
                otherTail.next=newNode;     // link previous node to this one
                otherTail = newNode;
                walk = walk.next;
            }
        }
        return other;
    }


    /**
     * Produces a string representation of the contents of the list.
     * This exists for debugging purposes only.
     */
    public String toString() {
        StringBuilder str = new StringBuilder();
        Node<E> curr = head;
        while (curr != null) {
            str.append(curr.element);
            if (curr != tail) {
                str.append(" -> ");
            }
            curr = curr.next;
        }
        return str.toString();
    }

    private class SinglyLinkedListIterator<E> implements Iterator<E> {
        @Override
        public boolean hasNext() {
            return false;
        }

        @Override
        public E next() {
            // TODO
            return null;
        }
    }

    public Iterator<E> iterator() {
        return new SinglyLinkedListIterator<E>();
    }

    public static void main(String[] args) {
        //ArrayList<String> all;
        //LinkedList<String> ll;

        SinglyLinkedList<String> sll = new SinglyLinkedList<String>();

        String[] alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".split("");

        for (String s : alphabet) {
            sll.addFirst(s);
            sll.addLast(s);
        }
        System.out.println(sll.toString());

        for (String s : sll) {
            System.out.print(s + ", ");
        }
    }
}

