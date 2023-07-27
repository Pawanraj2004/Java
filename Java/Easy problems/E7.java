//Check if a Number is Prime.
import java.util.Scanner;
public class E7 {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter your number :");
    int num = sc.nextInt();
    for(int i=2;i<=num/2;i++){
        if(num%i==0){
            System.out.print(num + " is not a Prime number");
            break;
        }
        if(i==num/2){
            System.out.print(num + " is a Prime number");
            break;
        }
    }
    sc.close();
    }
}

