//Find the number that appears only once(only one single element) in an odd numbered array.
import java.util.*;
public class M17 {
    public static int Single(int[] nums) {
        int result = 0;
        for (int num : nums) {
            result ^= num;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter number of elements in your array(odd) :");
        int n= sc.nextInt();
        int[] arr= new int[n];
        System.out.println("Enter your elements : ");
        for(int i=0;i<n;i++)
        arr[i]=sc.nextInt();
        System.out.println("The single number that appears only once is: " + Single(arr));
        sc.close();
    }
}