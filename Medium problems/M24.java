//Given an array containing all integers from N to M , find the missing numbers between them.
import java.util.*;

class M24 {
    public static void missing(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;
        System.out.print("Missing numbers between " + arr[0] + " and " + arr[n - 1] + " : ");
        for (int i = 0; i < n - 1; i++) {
            if (arr[i + 1] - arr[i] > 1) {
                for (int j = 1; j < arr[i + 1] - arr[i]; j++) {
                    System.out.print((arr[i] + j) + " ");
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter elements in the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        missing(arr);
        sc.close();
    }
}
