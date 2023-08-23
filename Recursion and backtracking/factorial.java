//Factorial.
import java.util.*;
class factorial{
    static int fact(int n){
        if(n==0 || n==1)
        return 1;
        int factorial = n*fact(n-1);
        return factorial;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number :");
        int n= sc.nextInt();
        System.out.println("Factorial of "+ n + " is : " +fact(n));
        sc.close();
    }
}