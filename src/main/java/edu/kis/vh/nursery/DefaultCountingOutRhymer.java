package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private static final int MAX_VALUE = 12;
    private static final int MIN_VALUE = -1;
    private int[] numbers = new int[MAX_VALUE];

    public int getTotal() {
        return total;
    }

    private int total = MIN_VALUE;

    protected void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    boolean callCheck() {
        return total == MIN_VALUE;
    }

    boolean isFull() {
        return total == MAX_VALUE-1;
    }

    int peekaboo() {
        if (callCheck())
            return MIN_VALUE;
        return numbers[total];
    }

    protected int countOut() {
        if (callCheck())
            return MIN_VALUE;
        return numbers[total--];
    }

}
