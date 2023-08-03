//Number of subarrays of having negative sums.
import java.util.*;
public class M3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements :");
        int n=sc.nextInt();
        int arr[]=new int[n];
        int sum=0;
        int count=0;
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for (int i=0;i<n;i++){
            for (int j=i;j<n;j++){
                for (int k=i;k<=j;k++){
                    sum = sum+arr[k];           
                }    
                if(sum<0){
                    count++;
                }
                sum=0;
            }
        }
        System.out.print("Number of subarrays having negative sums: "+count);
        sc.close();
    }
}