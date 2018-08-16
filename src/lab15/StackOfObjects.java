package lab15;

import java.util.ArrayList;

public class StackOfObjects {
	private Object elements[];// Stack of objects stored in the Object
	private int top;

	// Initlizing the default size of array capacity to 2
	public StackOfObjects() {
		this(2);
	}

	// push and pop methods
	public StackOfObjects(int initSize) {
		elements = new Object[initSize];
		top = -1;
	}

	public Object getTop() {
		if (top == -1)
			return null;
		return elements[top];
	}

	public boolean isEmpty() {
		return (top == -1);
	}

	public Object pop() {

		if (top == -1)
			return null;

		Object itm = elements[top];
		elements[top--] = null;

		if (top > 0 && top == elements.length / 4)
			resize(elements.length / 2);

		return itm;

	}

	public void push(Object itm) {
		if (top == elements.length - 1)
			resize(2 * elements.length);

		elements[++top] = itm;
	}

	public int size() {
		return (top + 1);
	}

	private void resize(int newSize) {
		Object t[] = (Object[]) new Object[newSize];
		for (int i = 0; i <= top; i++)
			t[i] = (Object) elements[i];
		elements = t;
	}

}
