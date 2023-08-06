//Find common numbers in two 1D arrays.
import java.util.*;
public class M10 {
    public static void common(int[] a,int[] b, int n,int m){
        int flag=0,i=0,j=0;
        Arrays.sort(a);
        Arrays.sort(b);
        while(i<n && j<m){
            if(a[i]==b[j]){
                System.out.print(a[i]+" ");
                flag=1;i++;j++;
            }
            else if(a[i]<b[j]){
                i++;
            }
            else
            j++;
        }
        if(flag==0)
        System.out.print(0);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter number of elements in first array :");
        int n=sc.nextInt();
        System.out.print("Enter number of elements in second array :");
        int m=sc.nextInt();
        int[] a= new int[n];
        int [] b=new int [m] ;
        System.out.println("Enter the elements of first array :");
        for(int i=0;i<n;i++)
        a[i]=sc.nextInt();
        System.out.println("Enter the elements of second array :");
        for(int i=0;i<m;i++)
        b[i]=sc.nextInt();
        System.out.print("Common Integers :");
        common(a,b,n,m);
        sc.close();
    }
}