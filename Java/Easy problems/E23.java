//Calculate Compound Interest
import java.util.*;
public class E23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        //compound interest
        double p,r,t;
        System.out.print("Enter principal amount: ");
        p=sc.nextDouble();
        System.out.print("Enter rate of interest per annum in decimal :");
        r=sc.nextDouble();
        System.out.print("Enter time period in years:");
        t=sc.nextDouble();
        double ci= p*(Math.pow((1+r/100),t));
        System.out.print("Compund interest : "+ci);
        sc.close();
    }
}
