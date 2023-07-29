//final keyword.
public class O8 {
    public static final void display(){
            System.out.println("Final method");
        }
    public static void main(String[] args) {
        final int a = 10;
        System.out.println("Final integer : "+a);
        display();
    }
}
