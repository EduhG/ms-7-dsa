// Given a number, find the next higher number using only the digits in the given number. 
//For example if the given number is 1508, the next higher number with same digits is 8510.

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ToyProblems;

/**
 *
 * @author EduhG
 */
public class NextHighest {

    public static void main(String[] args) {
        int num = 1508;
        System.out.println("The next largest Number is: " + NextHighest.getNextHighest(num));
    }

    public static int getNextHighest(int num) {
        StringBuilder myStr = new StringBuilder(Integer.toString(num));
        boolean notLargest = true;
        
        while (notLargest) {
            notLargest = false;
            
            for (int i = 0; i < myStr.length() - 1; i++) {
                if ((int) myStr.charAt(i) < (int) myStr.charAt(i + 1)) {
                    char temp = myStr.charAt(i);
                    
                    myStr.setCharAt(i, myStr.charAt(i + 1));
                    myStr.setCharAt(i + 1, temp);
                    
                    notLargest = true;
                }
            }
        }

        return Integer.parseInt(myStr.toString());
    }
}
