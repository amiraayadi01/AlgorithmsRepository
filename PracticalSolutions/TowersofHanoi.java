package PracticalSolutions;
public class TowersofHanoi {

    public static void towersOfHanoi(int n, char source, char middle, char destination) {

        if (n == 1) {
            System.out.println(source + " to " + destination);

        } else {

            towersOfHanoi(n - 1, source, middle, destination);
             System.out.println(source + " to " + destination);
            towersOfHanoi(n - 1, middle, destination, source);
        }


    }

    public static void towersOfHanoiTiming(){
        int n = 1;
        while(n <= 30){
            final long startTime = System.nanoTime();
            towersOfHanoi(n, 'A', 'B', 'C');
            final long elapsedTime = System.nanoTime() - startTime;
            System.out.println("Elapsed time for size  "+n+" : " +elapsedTime);
            n++;
        }
    }

    public static void main(String[] args) {
        towersOfHanoiTiming();
    }
}