package Classes;

import Interfaces.Queue;

/**
 * Realization of a circular FIFO queue as an adaptation of a
 * Classes.CircularlyLinkedList. This provides one additional method not part of the
 * general Interfaces.Queue interface. A call to rotate() is a more efficient simulation of
 * the combination enqueue(dequeue()). All operations are performed in constant
 * time.
 */

public class LinkedCircularQueue<E> implements Queue<E> {

	private CircularlyLinkedList<E> circle = new CircularlyLinkedList<>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

	public LinkedCircularQueue() { }

	@Override
	public int size() {
		return circle.size();
	}


	@Override
	public boolean isEmpty() {
		return circle.isEmpty();
	}


	@Override
	public void enqueue(E element) {
		circle.addLast(element);
	}


	@Override
	public E first() {
		return circle.first();
	}


	@Override
	public E dequeue() {
		return circle.removeFirst();
	}

}
