//Enum constructor.
enum Size {
   SMALL("Small."),
   MEDIUM("Medium."),
   LARGE("Large."),
   EXTRALARGE("Extra large.");
   private final String Samplesize;
   private Size(String Samplesize) {
      this.Samplesize = Samplesize;
   }
   public String display() {
      return Samplesize;
   }
}
class O23 {
   public static void main(String[] args) {
      Size size = Size.MEDIUM;
      System.out.println(size.display());
   }
}