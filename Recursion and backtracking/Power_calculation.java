//Power calculation of x to power n.
import java.util.*;
class Power_calculation {
    static int calculatePower(int x,int p){
        if (p==0)
        return 1;
        else
        return x*calculatePower(x,--p);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number :");
        int x = sc.nextInt();
        System.out.print("Enter power  :");
        int p = sc.nextInt();
        System.out.println(x + " to the power "+p+" is "+calculatePower(x,p));
        sc.close();
    }
}
