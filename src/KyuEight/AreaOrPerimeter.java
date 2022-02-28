package KyuEight;
import java.util.Scanner;

/*@author JoseFerAlvarez

--------------- Instructions -------------
You are given the length and width of a 4-sided polygon. The polygon can either
be a rectangle or a square. If it is a square, return its area.
If it is a rectangle, return its perimeter.
---------------------------------------------*/

public class AreaOrPerimeter {
    public static void main(String[] args){

        //Declaration of variables
        Scanner sc = new Scanner(System.in);
        
        int l = sc.nextInt();
        int w = sc.nextInt();
        
        //Introduce the value that returns the function areaOrPerimeter
        int aop = areaOrPerimeter(l,w);
        
        System.out.println(aop);
        sc.close();
    }
    
    //The code below is the solution
    public static int areaOrPerimeter(int l, int w){
        int aop;
        
        //If length and width are equals, calculate the area. If length and width are different, calculate the perimeter.
        if (l == w){
            aop = l*w;
        } else{
            aop = 2*l + 2*w;
        }
        return aop;
    }
}
