import java.util.Arrays;
public class EvenOddNumbers {
        static void evenNumber(int[] arr) {
                System.out.print("Even numbers in array : ");
                //for each loop
                for (int i : arr) {
                    //any numbers divided by 2 leaves remainder 0 is an even number
                    if (i % 2 == 0) {
                        System.out.print(i + "  ");
                    }
                }
            }
            static void oddNumber(int[] arr) {
                System.out.print("\nOdd numbers in array : ");
               
                for (int j : arr) {
                    
                    if (j % 2 != 0) {
                        System.out.print(j + "  ");
                    }
                }
            }
        
            public static void main(String[] args) {
        
                int[] arr = {10, 32, 43, 54, 65};
                System.out.println("a[] = " + Arrays.toString(arr));
                evenNumber(arr);
                oddNumber(arr);
            }
}
