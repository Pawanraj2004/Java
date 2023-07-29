//Recursion
public class O9 {
    static int fact(int n){
    if(n!=0){
        return n*fact(n-1);
    }
    else
     return 1;
}
public static void main(String[] args) {
    System.out.println("Factorial of a number(12): "+fact(12));
}
}
