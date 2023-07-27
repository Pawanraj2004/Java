//Convert decimal to binary.
import java.util.*;
public class E13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter decimal number :");
        int n=sc.nextInt();
        int temp=n;
        int[] bin=new int[100];
        int i=0;
        while(n>0){
            bin[i]=n%2;
            n=n/2;
            i++;
        }
        System.out.print("Binary of "+temp+" is ");
        for(int j=i-1;j>=0;j--)
        System.out.print(bin[j]);
        sc.close();
    }
}
