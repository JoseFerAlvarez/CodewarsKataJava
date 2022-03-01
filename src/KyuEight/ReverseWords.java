package KyuEight;

import java.util.Scanner;

/*@author JoseFerAlvarez

--------------- Instructions -------------
Complete the solution so that it reverses all of
the words within the string passed in.
---------------------------------------------*/

public class ReverseWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        System.out.println(reverseWords(str));

        sc.close();
    }

    //The code below is the solution
    public static String reverseWords(String str){
        
        //Declaration of variables
        String revStr = "";
        String word;
        int e = str.length();
        
        for(int i = str.length()-1; i>=0; i--){
            //if we are in a space, take the word on the right
            if(str.charAt(i) == ' '){
                word = str.substring(i+1, e);
                e = i;
                revStr = revStr+=word + " ";
            //If we are at the begin of the string, take the word on the right
            }else if(i == 0){
                word = str.substring(i, e);
                revStr = revStr+=word;
            }
            
        }

        return revStr;
    }

    /*public static String reverseWords(String str) {
        List<String> words = Arrays.asList(str.split(" "));
        Collections.reverse(words);
        return String.join(" ", words);
    }*/
}
