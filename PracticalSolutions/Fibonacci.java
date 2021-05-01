public class Fibonacci {

    private static long fibonacciIterative(int n) {
        if (n <= 1)
            return 0;
        
        if (n == 1) {
        	return 1;
        }
        

        int fib = 1;
        int prevFib = 1;

        for (int i = 2; i < n; i++) {
            int temp = fib;
            fib += prevFib;
            prevFib = temp;
        }
        return fib;
    }

    private static long fibonacciRecursion(int n) {

    	if (n == 0) {
    		return 0;
    	}
    	else {
    		if( n == 1 || n == 2) {
    			return 1;
    		}
    	}
    	return fibonacciRecursion(n - 2) + fibonacciRecursion(n - 1);
    }
    private static void fibonacciTimingComparison() {
        System.out.println("\nTiming (in nanoseconds) for Nth Fibonacci computation");
        System.out.println("\n%8s\t%8s\t%8s\t%8\n"+ "N" + "Iterative Time" + "Recursive Time"+ "Result\n" );
        int n = 1;
        while (n < 26) {
            long startTime = System.nanoTime();
            long iterative =  fibonacciIterative(n);
            final long elapsedT = System.nanoTime() - startTime;
            
            startTime = System.nanoTime();
            long recursion = fibonacciRecursion(n);
            final long elapsedT1 = System.nanoTime() - startTime;

            System.out.printf("%8d\t%8d\t%8d\t%8d", n, elapsedT , elapsedT1, (iterative == recursion));
            n++;
        }
    }


    public static void main(String[] args) {
        System.out.println("~ Iterative vs Recursive Nth Fibonacci number ~");
        fibonacciTimingComparison();

}
}