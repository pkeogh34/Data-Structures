package Classes;

import Interfaces.Queue;

public class ArrayQueue<E> implements Queue<E> {

	//instance variables
	public static final int CAPACITY = 1000;
	private E[] data;
	private int f = 0;
	private int size = 0;
	public ArrayQueue() {this(CAPACITY);}

	@SuppressWarnings({"unchecked"})
	public ArrayQueue(int capacity) {
		data = (E[]) new Object[capacity];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

	@Override
	public int size() {
		return size;
	}

	@Override
	public boolean isEmpty() {
		return size==0;
	}

	@Override
	public void enqueue(E e) {
		if (size == data.length) {
			throw new IllegalStateException("Queue is full");
		}
		int avail = (f + size) % data.length;
		data[avail] = e;
		size++;
	}

	@Override
	public E first() {
		if (isEmpty()) {
			return null;
		}
		return data[f];
	}

	@Override
	public E dequeue() {
		if (isEmpty()) {
			return null;
		}
		E answer = data[f];
		data[f] = null;
		f = (f + 1) % data.length;
		size--;
		return answer;
	}

}
