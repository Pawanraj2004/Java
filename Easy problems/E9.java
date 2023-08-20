import java.util.*;
public class E9 {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter number of terms in your array :");
    int n=sc.nextInt();
    int [] num  =new int [n];
    for(int i=0;i<n;i++){ 
        System.out.print("Enter element at "+ (i+1) +" position :");
        num[i]=sc.nextInt();
    }
    int max=num[0];
    for(int i=0;i<n;i++){
        if(num[i]>max)
        max=num[i];}
    System.out.print("Largest element in your array is :"+max);
    sc.close();
    }
}
