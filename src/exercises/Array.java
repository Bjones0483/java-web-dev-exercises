package exercises;
import java.util.Scanner;
public class Array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        int[] arr = new int[]{1, 1, 2, 3, 5, 8};
        for (int i = 0; i < arr.length; i = i + 2)
            System.out.println(arr[i]);
   }
}
