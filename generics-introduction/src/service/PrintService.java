package service;

import java.util.ArrayList;
import java.util.List;

public class PrintService<T> {

	List<T> intList = new ArrayList<>();

	public void addValue(T value) {
		intList.add(value);
	}

	public T first() {
		if (intList.isEmpty()) {
			throw new IllegalStateException("List is empty");
		} else {
			return intList.get(0);
		}
	}

	public void print() {
		System.out.println(intList);
	}

}
