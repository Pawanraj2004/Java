//this keyword.
//getter and setter.
class O7{
     int integer;
     void setter(int integer){
        this.integer= integer;
     }
     int getter(){
        return this.integer;
     }
     public static void main(String[] args) {
        O7 obj = new O7();
        obj.setter(10);
        System.out.println("Integer : "+obj.getter());
     }
}
