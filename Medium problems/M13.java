//Number of sub arrays having sum equal to a given target.
import java.util.*;
public class M13 {
    public static int count(int num[], int t){
        int count = 0;
        int sum = 0;
        int start = 0;
        for (int i = 0; i < num.length; i++) {
            sum += num[i];
            while (sum > t) {
                sum -= num[start];
                start++;
            }
            if (sum == t) {
                count++;
            }
        }
        return count;
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
        System.out.println("Number of sub arrays having sum equal to your target : "+count(arr,t));
        sc.close();
    }
}
