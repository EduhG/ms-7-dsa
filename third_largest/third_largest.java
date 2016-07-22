// Using the Java language, have the function ThirdGreatest(strArr)
// take the array of strings stored in strArr and return the third largest word within in.
// So for example: if strArr is ["hello", "world", "before", "all"]
// your output should be "world" because "before" is 6 letters long, and "hello" and "world" are both 5, but the output should be world because it appeared as the last 5 letter word in the array. If strArr was ["hello", "world", "after", "all"] the output should be after because the first three words are all 5 letters long, so return the last one. The array will have at least three strings and each string will only contain letters.

// use the main method only for calling the function where your logic lies. :-)

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
public class ThirdGreatest {
    public static void main(String[] args) {
        String[] arrayInput = {"hello"};
        
        System.out.println("Third Largest word in " + Arrays.toString(arrayInput) + " is \"" + thirdLargest(arrayInput) + "\" \n");
    }
    
    public static String thirdLargest(String[] arrayInput) {
        String result = "";
        
        boolean sort = true;
        String tempValue = "";
        while(sort) {
            sort = false;
            for(int i = 0; i < arrayInput.length - 1; i++){
                if(arrayInput[i].length() > arrayInput[i + 1].length()) {
                    tempValue = arrayInput[i + 1];
                    arrayInput[i + 1] = arrayInput[i];
                    arrayInput[i] = tempValue;
                    sort = true;
                }
            }
        }
        
        System.out.println(Arrays.toString(arrayInput));
        
        if(arrayInput.length < 3 && arrayInput.length > 0) {
            result = arrayInput[arrayInput.length - 1];
        } else {
            result = arrayInput[2];
        }
        
        return result;
    }
}
