//Find the Area of a Triangle given Base and Height
import java.util.*;
public class E20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter base :");
        Double b=sc.nextDouble();
        System.out.print("Enter height :");
        Double h=sc.nextDouble();
        double area=(b*h)/2;
        System.out.print("Area of triangle : "+ area);
        sc.close();
    }
}
