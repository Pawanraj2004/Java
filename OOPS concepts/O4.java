//constructors
class O4 {
    int i;
    O4(){
        System.out.println("Non-argument constructor");
        i=100;
    }
    O4(int a){
        System.out.println("Parameterised constructor with integer value :"+a);
        i=a;
    }
    public static void main(String[] args) {
        O4 obj1=new O4();
        System.out.println("Non-argument value of i:"+obj1.i);
        O4 obj2=new O4(5);
        System.out.println("Parameterised value of i :"+obj2.i);
    }
}
