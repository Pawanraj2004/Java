import java.util.*;
public class E21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter Celsius :");
        double celsius=sc.nextDouble();
        //formula to convert from Celsius to Fahrenheit is: 
        double fahrenheit=(   ((9*celsius)/5)+32);
        System.out.println ("Fahrenheit = "+fahrenheit+"°F ");        
        sc.close();
    }
}
