public class Counter {
    private int val;

    public void reset() {
        val = 0;
    }

    public void inc() {
        val++;
    }

    public void dec() {
        val--;
    }

    public int getValue() {
        return val;
    }

    public void copy(Counter x) {
        val = x.val;
    }

    public boolean equals(Counter x) {
        return val == x.val;
    }
}
