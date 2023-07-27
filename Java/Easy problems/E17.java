//Sort an Array in Ascending Order
import java.util.*;
public class E17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the size of array: ");
        int n=sc.nextInt();
        int []arr = new int[n];
        System.out.println("Enter your elements :");
        for(int i=0;i<n;++i){
            arr[i]=sc.nextInt();}
        Arrays.sort(arr);
        System.out.println("Sorted array :");
        for(int j=0;j<n;++j){
            System.out.print(arr[j]+" ");}
        sc.close();
    }
}
