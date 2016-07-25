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
        
        System.out.println("The Minimum Array is " + MaxMin.getMin(arrayInput));
        System.out.println("The Maximum Array is " + MaxMin.getMax(arrayInput));
    }
    
    public static int getMax(int[] arrayInput) {
        int maxVal = arrayInput[0];
        
        for(int i = 0; i < arrayInput.length; i++){
            if (arrayInput[i] >= maxVal) {
                maxVal = arrayInput[i];
            }
        }
        
        return maxVal;
    }
    
    public static int getMin(int[] arrayInput) {
        int minVal = arrayInput[0];
        
        for(int i = 0; i < arrayInput.length; i++){
            if (arrayInput[i] <= minVal) {
                minVal = arrayInput[i];
            }
        }
        
        return minVal;
    }
    
}
