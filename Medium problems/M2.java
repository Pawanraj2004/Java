//Maximum hour glass sum.
import java.util.*;
public class M2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[][] arr=new int[6][6];
        System.out.println("Enter 36 values(6x6 array) :");
        for(int i=0;i<6;i++){
            for(int j=0;j<6;j++){
                arr[i][j]=sc.nextInt();}}
        int max = -100;
       for(int i = 0;i<4;i++){
           for(int j=0;j<4;j++){
        int sum = arr[i][j] + arr[i][j+1] + arr[i][j+2] + arr[i+1][j+1]+ arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2];
        if(sum>=max)
        max=sum;
        }
        }
        System.out.println("Sum of maximum hour glass :"+max);
        sc.close();
    }
}
