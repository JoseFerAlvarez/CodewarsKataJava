package KyuEight;
import java.util.Scanner;

/*@author josef

--------------- Instructions -------------
You are given the length and width of a 4-sided polygon. The polygon can either 
be a rectangle or a square. If it is a square, return its area. 
If it is a rectangle, return its perimeter.
---------------------------------------------*/

public class AreaOrPerimeter {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int l = sc.nextInt();
        int w = sc.nextInt();
        
        int aop = areaOrPerimeter(l,w);
        
        System.out.println(aop);
    }
    
    //The code below is the solution
    public static int areaOrPerimeter(int l, int w){
        int aop;
                
        if (l == w){
            aop = l*w;
        } else{
            aop = 2*l + 2*w;
        }
        return aop;
    }
}
