//Find GCD of two numbers.
import java.util.*;
public class E15 {
    public static int gcd(int a,int b){
        int gcd=1;
        for(int i=1;i<Math.min(a,b);i++){
            if(a%i==0 && b%i==0)
            gcd=i;
        }
        return gcd;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number :");
        int n1=sc.nextInt();
        System.out.print("Enter second number :");
        int n2=sc.nextInt();
        System.out.print("The greatest common divisor or GCD of "
        +n1+" and "+n2+": "+gcd(n1,n2));
        sc.close();
    }
}
