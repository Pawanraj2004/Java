import java.util.Scanner;
public class E8 {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter your number :");
    int num = sc.nextInt();
    System.out.print("Fibonacci Series till "+num+
    " number of terms : \n0 1 ");
    int a=0,b=1;
    for(int i=2;i<num;i++){
        int c= a+b;
        System.out.print(c+" ");
        a=b;
        b=c;
    }
    sc.close();
    }
}
