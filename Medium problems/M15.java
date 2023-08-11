//Remove repeating values.
import java.util.*;
class M15 {
    public static void single(int[] arr){
        System.out.println("Array after removing repeating values : ");
        for(int i=0;i<arr.length;i++){
          if(i==0 || arr[i]!=arr[i-1])
          System.out.print(arr[i]+ " ");
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter number of elements in your array :");
        int n= sc.nextInt();
        int[] arr= new int[n];
        System.out.println("Enter your elements : ");
        for(int i=0;i<n;i++)
        arr[i]=sc.nextInt();
        single(arr);
        sc.close();
    }
}
