import java.util.Arrays;

public class CommonValuesInTwoArrays {
        static void commonValues(int[] arr1, int[] arr2) {
              
                for (int j : arr1) {
                    for (int i : arr2) {
                        if (j == i) {
                            System.out.println("Common values : " + j);
                        }
                    }
                }
}
public static void main(String[] args) {
        
        int[] arr1 = {11, 25, 33, 84, 35};
        int[] arr2 = {66, 55, 79, 11, 98};
        System.out.println("arr1[] = " + Arrays.toString(arr1));
        System.out.println("arr2[] = " + Arrays.toString(arr2));
        commonValues(arr1, arr2);
    }
}