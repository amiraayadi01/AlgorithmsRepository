import java.util.Arrays;
import java.lang.*;


public class ThreeSumsB {

    private ThreeSumsB() { }

    private static boolean containsDuplicates(int[] a) {
        for (int i = 1; i < a.length; i++)
            if (a[i] == a[i-1]) return true;
        return false;
    }


    public static int count(int[] a) {
        int n = a.length;
        Arrays.sort(a);
        if (containsDuplicates(a)) throw new IllegalArgumentException("array contains duplicate integers");
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                int k = Arrays.binarySearch(a, -(a[i] + a[j]));
                if (k > j) count++;
            }
        }
        return count;
    } 

    public static void main(String[] args)  { 
        In in = new In(args[0]);
        int[] a = in.readAllInts();
        final long startTime = System.currentTimeMillis();
        int count = count(a);
        final long elapsedTime = System.currentTimeMillis() - startTime;
        System.out.println("count =" + count);
        System.out.println("Time elapsed = " + elapsedTime);
    } 
}