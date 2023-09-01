//Get the nth fibonacci term.
import java.util.*;
class fibonacci {
    static int fibo(int i){
        if(i==0 || i==1)
        return i;
        return fibo(i-1) + fibo(i-2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the term :");
        int n= sc.nextInt();
        System.out.println("Your fibonacci value : " + fibo(n));
        sc.close();
    }
}
