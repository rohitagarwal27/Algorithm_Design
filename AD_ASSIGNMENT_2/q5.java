package AD_ASSIGNMENT_2;
// find Gcd 
import java.util.*;
public class q5 
{
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter two number");
        int a=obj.nextInt();
        int b=obj.nextInt();
        System.out.println("The GCD of "+a+" and "+b+" is : "+findGCD(a,b));  
    }
    public static int findGCD(int x,int y)
    {
        if(y==0)
            return x;
        return (findGCD(y, x%y));
    }
}