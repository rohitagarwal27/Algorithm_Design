package AD_ASSIGNMENT_2;
// find power of the number to the number its self
import java.util.*;
public class q7 
{
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=obj.nextInt();
        System.out.println("Enter the power");
        int p=obj.nextInt();
        System.out.println(n+" power of "+p+" is : "+findPower(n,p));  
    }
    public static int findPower(int n,int p)
    {
        if(p==0)
            return 1;
        return n*(findPower(n, p-1));
    }
}