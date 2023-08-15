//Number of exchanging values operations(a[i]=a[j] or a[j]=a[i]) required to make array equal.
import java.util.*;
class M20 {
    public static void main(String[] args) {
        System.out.print("Enter number of elements :");
        Scanner sc = new Scanner (System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        int[] arr2 = new int[500];
        System.out.println("Enter your elements : ");
        for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
        arr2[arr[i]]++;}
		Arrays.sort(arr2);
		System.out.println("Number of operations required :"+ (n-arr2[499]));
        sc.close();
    }
}
