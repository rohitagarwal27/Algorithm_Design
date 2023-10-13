package AD_ASSIGNMENT_2;

import java.util.*;

// linear serch ussing recursion
public class q8 {
    public static int recSearch(int input_array[],  int r, int e) {
      if (r < 1)
         return -1;
      if (input_array[1] == e)
         return 1;
      else if (input_array[r] == e)
        return r;  
      return recSearch(input_array, r-1, e);
   }
   public static void main(String[] args) {
      int input_array[] = {14, 20, 35, 47, 50, 65, 72, 81, 90, 99};
      Scanner sc = new Scanner(System.in);
      int x = sc.nextInt();
      System.out.println("\n\nThe elements to be searched in the array is: " + x);
      int index = recSearch(input_array, input_array.length-1, x);
      if (index != -1)
         System.out.println("\nThe element " + x + " is present at position: " + index);
      else
         System.out.println("Element " + x + " is not present: ");
   }
}
 