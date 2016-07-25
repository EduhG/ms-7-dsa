// Using java solve the problem below:

//Create your own array of integers
// Find the maximum and minimum of this array that you just created.
// create a variable to hod the maximum
// create a variable to hold the minimum
// take in the array of numbers
// begin to loop through them
// put the lowest in its array 
// put the highest in its array
// output the highest then output the lowest

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ToyProblems;

import java.util.Arrays;

/**
 *
 * @author EduhG
 */
public class MaxMin {
    public static void main(String[] args) {
        int[] arrayInput = {45, 9, 102, 34, 83};
        
        int minimum = MaxMin.getMin(arrayInput);
        int maximum = MaxMin.getMax(arrayInput);
        
        int[] minArray = new int[1];
        int[] maxArray = new int[1];
        
        for(int i = 0; i < arrayInput.length - 1; i++){
            if (arrayInput[i] <= minimum) {
                minArray[0] = arrayInput[i];
            }
            
            if (arrayInput[i] <= maximum) {
                maxArray[0] = arrayInput[i];
            }
        }
        
        System.out.println("The Minimum Array is " + Arrays.toString(minArray));
        System.out.println("The Maximum Array is " + Arrays.toString(maxArray));
    }
    
    public static int getMax(int[] arrayInput) {
        Arrays.sort(arrayInput);
        return arrayInput[arrayInput.length - 1];
    }
    
    public static int getMin(int[] arrayInput) {
        Arrays.sort(arrayInput);
        return arrayInput[0];
    }
}
