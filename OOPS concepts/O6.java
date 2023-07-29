//Access Modifiers.
class temp{
    private int a = 10;
    public int b= 5;
    public void geta(){
        System.out.println("a : "+ a);
    }
}
class O6 {
    public static void main(String[] args) {
        temp t = new temp();
        t.geta();
        System.out.println("b : "+ t.b);
        
    }
}
