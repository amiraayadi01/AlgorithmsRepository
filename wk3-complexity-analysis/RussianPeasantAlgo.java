/******************************************************************************
 *  Compilation:  javac your filename
 *  Execution:    java insert your instructions
 * 
 ******************************************************************************/
import java.util.Arrays;
import java.lang.*;

public class RussianPeasantAlgo {
//a function to multiply two numbers
//using the Russian Peasant method


    // Do not instantiate.
    private RussianPeasantAlgo() { }



    /**
     * Returns the producc
     *
     * @param  a the array of integers
     * @return ...
     */
    
    public static int multiply(int[] a) {
        //insert your multiplication code here


    } 


/**
     * Reads in a sequence of integers from a file, specified as a command-line argument;
     * Multiplies each pair of integers in the file together and outputs 
     * the product
     * Times the overall time taken to run through the input files 
     *
     * @param args the command-line arguments
     */
    public static void main(String[] args)  { 
        In in = new In(args[0]);
        int[] a = in.readAllInts();

        //Helper file to measure time count function takes to run
        Stopwatch timer = new Stopwatch();
        //call your RussianAlgorithm function here
        StdOut.println("elapsed time = " + timer.elapsedTime());

    } 
}


