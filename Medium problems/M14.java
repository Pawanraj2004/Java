//All combinations in  an array having sum equal to a target.
import java.util.Scanner;
public class M14 {
    public static void combination(int[] arr, int t, int start, String currentCombination) {
        if (t < 0) {
            return;
        }
        if (t == 0) {
            System.out.println(currentCombination);
            return;
        }

        for (int i = start; i < arr.length; i++) {
            combination(arr, t - arr[i], i, currentCombination + arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of elements in your array :");
        int n= sc.nextInt();
        int arr [] = new int [n];
        System.out.println("Enter the Elements:");
        for (int i = 0 ; i<n;++i )
        arr[i]=sc.nextInt();
        System.out.println("Enter your target sum :");
        int t=sc.nextInt();
        System.out.println("All possible combinations for target " + t + ":");
        combination(arr, t,0,"");
        sc.close();
    }
}
