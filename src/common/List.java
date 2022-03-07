package common;

public interface List<T> {
	int length();

	T getItem(int index);

	void setItem(int index, T item);

	default void swap(int i, int j) {
		T temp = getItem(i);
		setItem(i, getItem(j));
		setItem(j, temp);
	}
}
