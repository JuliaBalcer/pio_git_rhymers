package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

	private static final int _ARRAY_SIZE = 12;
    private static final int _MAX_ARRAY_INDEX = _ARRAY_SIZE - 1;
    private static final int _EMPTY_ARRAY_INDICATOR = -1;
    private static final int _EMPTY_ARRAY_VALUE = -1;

	private int[] numbers = new int[_ARRAY_SIZE];
    public int total = _EMPTY_ARRAY_INDICATOR;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == _EMPTY_ARRAY_INDICATOR;
    }

    public boolean isFull() {
        return total == _MAX_ARRAY_INDEX;
    }

    protected int peekaboo() {
        if (callCheck())
            return _EMPTY_ARRAY_VALUE;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return _EMPTY_ARRAY_VALUE;
        return numbers[total--];
    }

}
