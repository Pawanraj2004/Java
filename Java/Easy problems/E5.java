import java.util.Scanner;
public class E5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        int sum=0;
        for (int i = 0; i <= num; i++) {
            sum = sum + i;
        }
        System.out.print("Sum of integers till "+num+ " is "+sum);
        input.close();
    }
}
