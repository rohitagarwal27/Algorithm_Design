// Question-7:
//Factorial of a number by using an iterative approach:
 
import java.util.*;
public class q7 
{
    public static void main(String[] args) 
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=obj.nextInt();
        int fact=1;
        while(n>0)
        {
            fact*=n;
            n--;
        }
        System.out.println("The factorial is "+fact);
    }
}