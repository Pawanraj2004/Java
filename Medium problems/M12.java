//Two elements having sum equal to a given target.
import java.util.*;
public class M12 {
    public static void sum(int num[], int t){
        for (int i = 0; i < num.length - 1; i++) {
            for (int j = i + 1; j < num.length; j++) {
                int sum = num[i] + num[j];
                if (sum == t) {
                    System.out.println(num[i] + " + " + num[j] + " = " + sum);
                }
            }
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
        System.out.println("Elements having sum equal to your target : ");
        sum(arr,t);
        sc.close();
    }
}
