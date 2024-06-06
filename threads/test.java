package threads;


class SumThread extends Thread {
    private long start, end, sum = 0;

    public SumThread(long start, long end) {
        this.start = start;
        this.end = end;
    }

    public void run() {
        for (long i = start; i <= end; i++) {
            sum += i;
        }
    }

    public long getSum() {
        return sum;
    }
}

