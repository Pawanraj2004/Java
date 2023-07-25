import java.util.Scanner;
public class E4 {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter year :");
        int year=sc.nextInt();
        if(year%4==0)
        System.out.print("Leap year");
        else
        System.out.print("Non-leap year");
        sc.close();
}
}