//InstanceOf Operator.
public class O10 {
    public static void main(String[] args) {
        String str= "Pawan";
        System.out.println("Is 'str' an instance of class 'String' : "+ (str instanceof String));
        O10 obj = new O10();
        System.out.println("obj is an instance of O10: " + (obj instanceof O10));
    }
}
