package AD_ASSIGNMENT_2;
//recursive sum 
import java.util.*;
public class q1
{
    public static void main(String[] args) 
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n=obj.nextInt();
        int[] arr=new int [n];//Creating an array of n size        
        System.out.println("enter the numbers in the array");
        for (int i = 0; i <n; i++)
            arr[i]=obj.nextInt();
        System.out.println("The sum is "+Sum(arr,n));  
    }
    public static int Sum(int[] arr,int n)
    {
        if(n<=0)
            return 0;
        return (Sum(arr,n-1)+arr[n-1]);
    }
}