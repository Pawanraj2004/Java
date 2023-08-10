//Find the maximum value of arr[i]+(arr[j]*arr[k]) given i<j<k and arr[i]<arr[j]<arr[k].
import java.util.*;
public class M16{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements in array : ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter elements :");
        for(int i=0;i<n;i++)
        arr[i]=sc.nextInt();
        int max= 0;
        for(int i=n-1;i>=0;i--){
            for(int j=n-1;j>i;j--){
                for(int k=n-1;k>j;k--){
                    if(arr[i]<arr[j] && arr[j]<arr[k]){
                        int operation = arr[i]+(arr[j]*arr[k]);
                        if(operation>max)
                        max=operation;
                    }
                }
            }
        }
        System.out.println("Msximum value of arr[i]+(arr[j]*arr[k]) : " +max);
        sc.close();
    }
}