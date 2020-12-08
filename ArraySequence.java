import java.util.NoSuchElementException;
public class ArraySequence implements IntegerSequence {

private int currentIndex;
private int[] data;

public ArraySequence(int[] other) {
	data = other;
	currentIndex = 0;
}

public ArraySequence(IntegerSequence otherseq) {
	otherseq.reset();
	int[] store = new int[otherseq.length()];
	while (otherseq.hasNext()) {
		store[currentIndex] = otherseq.next();
		currentIndex++;
	}
	data = store;
	reset();
	otherseq.reset();
}

public int length() {
	return data.length;
}

public void reset() {
	currentIndex = 0;
}

public boolean hasNext() {
	if (currentIndex >= length()) {
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
