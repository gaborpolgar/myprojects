package hu.ak_akademia.genericsdemo;

public class Box<T> {

	private T content;

	@Override
	public String toString() {
		return "Box [content=" + content + "]";
	}

	public boolean isEmpty() {
		return content == null;
	}

	public void putIn(T item) {
		if (!isEmpty()) {
			throw new IllegalStateException("A dobozban már van valami.");
		}
		content = item;

	}
	
	public T takeOut() {
		T item = content;
		content = null;
		return item;
	}
}
