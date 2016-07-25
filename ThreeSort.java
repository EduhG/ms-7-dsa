// Create a ThreeSort class with a threeSort method and a main method.
// The threeSort method should contain the algorithm and the main method
// should be used for testing your algorithm. To make that easier, make the
// threeSort method static.

// Given three numbers as input, find the min, middle and max of the three.
// Return an array of the numbers in ascending order.
// Hint: to easily see your output, import java.util.Arrays
// and use the Arrays.toString(array) method to convert the Array to a string
// and then log it using System.out.println();
/*solution*/
**java
package arrays;
import java.util.*;
/**
 *
 * @author benard
 */
public class ThreeSort{
    public static int[]threeSort (int[] a){
        Arrays.sort(a);
        return a;
    }

    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) {
        int[] A = {900,200,300};
        threeSort(A);
        for (int num : A) {
   System.out.println("sorted array = " + num);
        // TODO code application logic here
    }
System.out.println("minimun = "+A[0]);
System.out.println("middle = "+A[1]);
System.out.println("maximum = "+A[2]); 
}
}

