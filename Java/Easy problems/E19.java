//Generate a Random Number between a Range
import java.util.*;
public class E19 {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        Random ran = new Random();
        System.out.print("Enter start point :");
        int start = sc.nextInt();
        System.out.print("Enter end point  :");
        int end = sc.nextInt();
        System.out.print("Random number between "+start+" and "
        +end+" : "+ ran.nextInt(start,end));
        sc.close();
    }
}
