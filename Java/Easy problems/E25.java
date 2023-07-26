import java.util.*;
public class E25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter number :");
        int n=sc.nextInt();
        System.out.print("Enter the last multiplier of table :");
        int t=sc.nextInt();
        System.out.println("Table of "+n+" : ");
        for(int i=1;i<=t;i++){
            System.out.println(n+" * "+i+" = "+(n*i));
        }
        sc.close();
    }
}
