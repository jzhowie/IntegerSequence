import java.util.NoSuchElementException;
public class Range implements IntegerSequence {
private int start, end, current;

public Range (int s, int e) {
	start = s;
	end = e;
	current = start;
}

public void reset() {
	current = start;
}

public int length() {
	return end - start + 1;
}

public boolean hasNext() {
	if (current > end) {
		return false;
	}
	return true;
}

public int next() {
	if (hasNext() == false) {
		throw new NoSuchElementException();
	}
	int temp = current;
	current++;
	return temp;
}
}
