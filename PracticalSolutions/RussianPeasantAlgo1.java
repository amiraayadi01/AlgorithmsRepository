package PracticalSolutions;
import java.util.Random;

public class RussianPeasantAlgo1 {


    public static long russianAlgorithmSolver(int A, int B) {

   
        int result = 0;
        while (A > 0) {

            if (A % 2 != 0) {

                result += B;
            }

            A /= 2;
            B *= 2;
        }
        return result;
    }

    public static void russianAlgorithmTiming(){
   
        int n = 1;
        while(n < (int)(Math.pow(3, 10))){
        	int max = n *10;
        	int min = n;
        	
        	Random r = new Random();
        	long A = r.nextInt((max - min) + 1) + min;
            long B = r.nextInt((max - min) + 1) + min;
            int i = 3;
        	long startTime = System.nanoTime();
        	long answer = russianAlgorithmSolver(i, i);
        	long elapsedT = System.nanoTime() - startTime;
        	System.out.printf("The Time Taken: " + elapsedT + "A =" + A + "B = " + B + "Answer = " + answer);
        	
        }
    }
    public static void main(String[] args) {
    	System.out.println("Russian Peasant Algorithm Multiplication");
    	russianAlgorithmTiming();
    }
}