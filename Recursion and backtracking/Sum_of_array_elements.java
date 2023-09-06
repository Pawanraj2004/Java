//Sum of array elements.
import java.util.*;
class Sum_of_array_elements{
    static int sumOfElements(int arr[], int n){
        if (n == arr.length) {
            return 0;
        }
        return arr[n] + sumOfElements(arr, n + 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements :");
        int n =sc.nextInt();
        int arr[]=new int[n];
        System.out.print("Enter your elements : ");
        for(int i=0;i<n;i++)
        arr[i]=sc.nextInt();
        System.out.println("Sum of  your elements : "+ sumOfElements(arr,0));
        sc.close();
    }
}