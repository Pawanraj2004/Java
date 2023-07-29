//Method overloading.
class O3 {
    //Method sum
    public static void sum(){
        System.out.println("Sum of two numbers : 0");
    }
    //Method sum overloaded with one parameter
    public static void sum(int a){
        System.out.println("Sum of two numbers : "+a);
    }
    //Method sum overloaded with two parameter
    public static void sum(int a,int b){
        System.out.println("Sum of two numbers : "+(a+b));
    }
    //Method sum overloaded with changing data type
    public static void sum(double a){
        System.out.println("Sum of two numbers : "+a);
    }
    public static void main(String[] args) {
        sum();
        sum(5);
        sum(5,10);
        sum(5.0);
    }
}
