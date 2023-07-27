//Swap two numbers.
import java.util.*;
public class E14 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter first number :");
        int num1= sc.nextInt();
        System.out.print("Enter second number :");
        int num2= sc.nextInt();
        System.out.println("Before swapping :");
        System.out.println("First number :"+num1+" Second number :"+num2);
        int temp=num1;
        num1=num2;
        num2=temp;
        System.out.println("After swapping :");
        System.out.println("First number :"+num1+" Second number :"+num2);
        sc.close();
    }
}
