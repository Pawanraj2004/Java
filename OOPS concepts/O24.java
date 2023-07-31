//Enum String.
enum Size {
   SMALL {
      public String toString() {
        return "The size is small.";
      }
   },

   MEDIUM ;
}

class O24 {
   public static void main(String[] args) {
    System.out.println(Size.SMALL.toString());
      System.out.println(Size.MEDIUM.toString());
   }
}