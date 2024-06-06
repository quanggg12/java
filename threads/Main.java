package threads;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        int numThreads = 10;
        long totalSum = 0;
        long range = 1000000000;
        SumThread[] threads = new SumThread[numThreads];

        long start = System.currentTimeMillis();

        for (int i = 0; i < numThreads; i++) {
            threads[i] = new SumThread(i * range/numThreads, (i + 1) * range/numThreads - 1);
            threads[i].start();
        }
        long end = System.currentTimeMillis();
        for (SumThread thread : threads) {
            thread.join();
            totalSum += thread.getSum();
        }

        System.out.println("Time: " + (end - start));
        System.out.println("Total sum: " + totalSum);
    }
}