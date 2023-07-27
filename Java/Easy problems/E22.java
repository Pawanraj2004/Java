//Calculate Simple Interest
import java.util.*;
public class E22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the principal amount: ");
        double p = sc.nextDouble();
        System.out.print("Enter the rate of interest per annum :");
        double r = sc.nextDouble();
        System.out.print("Enter time period in years:");
        int t=sc.nextInt();
        double si=(p*r*t)/100;
        System.out.print("Simple Interest is "+si);
        sc.close();
    }
}
