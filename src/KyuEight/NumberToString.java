package KyuEight;

import java.util.Scanner;

/*@author JoseFerAlvarez

--------------- Instructions -------------
We need a function that can transform a number into a string.
What ways of achieving this do you know?
---------------------------------------------*/

public class NumberToString {
    public static void main(String[] args){

        //Declaration of variables
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        //Print the result of the function numberToString
        System.out.println(numberToString(num));

        sc.close();
    }
    
    //The code below is the solution
    public static String numberToString(int num){
        return String.valueOf(num);
    }
}
