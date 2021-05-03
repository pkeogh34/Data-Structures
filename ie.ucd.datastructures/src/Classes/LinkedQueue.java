package Classes;

import Interfaces.Queue;

public class LinkedQueue<E> implements Queue<E> {
	SinglyLinkedList<E> list = new SinglyLinkedList<>();

	@Override
	public int size() {
		return list.size();
	}

	@Override
	public boolean isEmpty() {
		return list.size() == 0;
	}

	@Override
	public void enqueue(E e) {
		list.addFirst(e);
	}

	@Override
	public E first() {
		return list.first();
	}

	@Override
	public E dequeue() {
		return list.removeLast();
	}

}
