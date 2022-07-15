
import java.util.*;

public class CopyArray {
        static void copyingArray(int[] arr) {
           
                int[] copy = arr;
               
                System.out.println("Array after copying to c = " + Arrays.toString(copy));
}
public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
     
        System.out.print("Enter the number of elements you want to store : ");
        n = sc.nextInt();
    
        System.out.println("Enter the Elements of the array ");
  
        int[] my_arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("my_arr[%d] = ", i);
      
            my_arr[i] = sc.nextInt();
        }
        System.out.println("my_arr = " + Arrays.toString(my_arr));
     
        copyingArray(my_arr);
    }
}