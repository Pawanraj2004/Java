//Calculate the Area of a Circle
import java.util.Scanner;
public class E2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Radius of your circle :");
        double r= sc.nextDouble();
        double area = 3.14*r*r;
        System.out.println("The Area Of Your Circle is "+area+" sq units.");
        sc.close();
    }
}
