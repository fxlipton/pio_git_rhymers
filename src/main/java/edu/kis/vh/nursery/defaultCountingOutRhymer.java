package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private static final int ARRAY_SIZE = 12;
    private static final int TOTAL = -1;
    private static final int FULL = 11;

    private final int[] NUMBERS = new int[ARRAY_SIZE];
    private int total = TOTAL;

    protected void countIn(int in) {
        if (!isFull())
            NUMBERS[++total] = in;
    }

    protected boolean callCheck() {
        return total == TOTAL;
    }

    protected boolean isFull() {
        return total == FULL;
    }

    protected int peekaboo() {
        if (callCheck())
            return TOTAL;
        return NUMBERS[total];
    }

    protected int countOut() {
        if (callCheck())
            return TOTAL;
        return NUMBERS[total--];
    }

}
