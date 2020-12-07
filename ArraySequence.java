import java.util.NoSuchElementException;
public class ArraySequence implements IntegerSequence {
int currentIndex;
int[] data;

public ArraySequence(int[] other) {
	data = other;
	currentIndex = 0;
}

public int length() {
	return data.length;
}

public void reset() {
	currentIndex = 0;
}

public boolean hasNext() {
	if (currentIndex >= this.length()) {
		return false;
	}
	return true;
}

public int next() {
	if (hasNext() == false) {
		throw new NoSuchElementException();
	}
	int temp = data[currentIndex];
	currentIndex++;
	return temp;
}
}
