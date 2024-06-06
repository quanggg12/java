package threads;

public class Calculator {
    public long sum() {
        long sum = 0;
        for (int i = 0; i < 1000000000; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Calculator cal = new Calculator();
        long start = System.currentTimeMillis();
        long sum = cal.sum();
        long end = System.currentTimeMillis();
        System.out.println("Sum: " + sum);
        System.out.println("Time is ms: " + (end - start));
    }
}




