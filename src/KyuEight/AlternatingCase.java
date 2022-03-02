package KyuEight;
import java.util.Scanner;

/*@author JoseFerAlvarez

--------------- Instructions -------------
Define String.prototype.toAlternatingCase (or a similar function/method
such as to_alternating_case/toAlternatingCase/ToAlternatingCase in your
selected language; see the initial solution for details) such that each
lowercase letter becomes uppercase and each uppercase letter becomes
lowercase.
---------------------------------------------*/

public class AlternatingCase {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        System.out.println(toAlternativeString(str));
        sc.close();
    }

    //The code below is the solution
    public static String toAlternativeString(String string) {

        //Declaration of variables
        String strFinal = "";

        //It goes through the string letter by letter
        for(int i=0; i < string.length(); i++){
            //if the letter is uppercase it converts it to lowercase
            if(Character.isUpperCase(string.charAt(i))){
                strFinal += Character.toLowerCase(string.charAt(i));
            //if the letter is lowercase it converts it to uppercase
            }else{
                strFinal += Character.toUpperCase(string.charAt(i));
            }
        }
        return strFinal;
    }
}
