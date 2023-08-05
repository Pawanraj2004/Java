//Add two 2x2 Matrix.
import java.util.*;
class M8{
    public static void add(int[][] a,int[][]b){
        int[][] c={{0,0},{0,0}};
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                c[i][j]=a[i][j]+b[i][j];
            }
        }
        System.out.println("Sum of the matrix is");
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++) {
                System.out.print(c[i][j]+" ");}
                System.out.print("\n");
                }
    }
 public static void main(String args[]){
    Scanner sc=new Scanner (System.in);
    int a[][]=new int[2][2];
    int b[][]=new int[2][2];
    System.out.println("Enter first matrix :");
    for(int i=0;i<2;i++){
            for(int j=0;j<2;j++) {
                a[i][j]=sc.nextInt();}
                }
    System.out.println("Enter second matrix :");
    for(int i=0;i<2;i++){
            for(int j=0;j<2;j++) {
                b[i][j]=sc.nextInt();}
                }
    add(a,b);
    sc.close();
 }
}