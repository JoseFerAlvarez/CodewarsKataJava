package KyuSeven;

import java.util.Scanner;

/*@author JoseFerAlvarez

--------------- Instructions -------------
In this little assignment you are given a string
of space separated numbers, and have to return
the highest and lowest number.
---------------------------------------------*/

public class HighestLowest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String numbers = sc.nextLine();

        System.out.println(highAndLow(numbers));

        sc.close();
    }

    //The code below is the solution
    public static String highAndLow(String numbers) {

        //Declaration of variables
        String[] numArray = numbers.split(" ");
        int min = Integer.parseInt(numArray[0]);
        int max = Integer.parseInt(numArray[0]);
        
        /*Min and max starts at first number, if the next number is bigger than max, it becomes the biggest number.
        if the next number is lower than min, it becomes the lowest number.*/
        for(int i = 0; i<numArray.length; i++){
            int num = Integer.parseInt(numArray[i]);
            if(num < min){
                min = num;
            }else if(num > max){
                max = num;
            }
        }

        return max + " " + min;
    }
}
