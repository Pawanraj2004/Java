//Check if a Number is Positive, Negative, or Zero.
import java.util.Scanner;
public class E3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Number :");
        int n=sc.nextInt();
        if(n>0)
        System.out.println("Positive");
        else if(n<0)
        System.out.println("Negative");
        else
        System.out.println("Zero");
        sc.close();
    }
}
