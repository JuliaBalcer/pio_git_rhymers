package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private static final int _TOTAL = -1;

	private static final int _ARRAY_SIZE = 12;

    private static final int _MAX_ARRAY_INDEX = _ARRAY_SIZE - 1;

	private int[] numbers = new int[_ARRAY_SIZE];

    public int total = _TOTAL;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == _TOTAL;
    }

    public boolean isFull() {
        return total == _MAX_ARRAY_INDEX;
    }

    protected int peekaboo() {
        if (callCheck())
            return _TOTAL;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return _TOTAL;
        return numbers[total--];
    }

}
