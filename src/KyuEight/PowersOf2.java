package KyuEight;
import java.util.Scanner;

/*@author JoseFerAlvarez

--------------- Instructions -------------
Complete the function that takes a non-negative
integer n as input, and returns a list of all the powers
of 2 with the exponent ranging from 0 to n (inclusive).
---------------------------------------------*/

public class PowersOf2 {
    public static void main(String[] args){
        
        //Declaration of variables
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        //If n is positive, go to powersOfTwo function and print the result
        if (n >= 0){
            for(int i=0;i<=n;i++){
                long[] numeros = powersOfTwo(n);
                System.out.print("[" + numeros[i]  + "],");
            }
        }else{
            System.out.println("Escribe un numero valido (no negativo)");
        }

        sc.close();

    }

    public static long[] powersOfTwo(int n){

        //Declaration of variables
        long potencias[] = new long[n+1];
        final int NUMBER = 2;

        //Compute powers of 2 and put them in a list
        for (int i=0; i<=n; i++){
            potencias[i]=(long)Math.pow(NUMBER, i);
        }

        return potencias;
    }
}
