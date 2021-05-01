package PracticalSolutions;
public class ThreeSumsA {


    private ThreeSumsA() { }

    public static int count(int[] a) {
        int n = a.length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                for (int k = j+1; k < n; k++) {
                    if (a[i] + a[j] + a[k] == 0) {
                        count++;
                    }
                }
            }
        }
        return count;
    }

    public static void main(String[] args)  {
        In in = new In("1Kints.txt");
        int[] a = in.readAllInts();
        final long startTime = System.currentTimeMillis();
        int count = count(a);
        final long elapsedTime = System.currentTimeMillis() - startTime;
        System.out.println("Count =" + count);
        System.out.println("Time Taken = " + elapsedTime);
    }
}
