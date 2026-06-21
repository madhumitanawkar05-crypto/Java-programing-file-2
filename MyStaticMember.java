class MyStaticMember
{
   static int a = 5;
   public static void main(String args[])
   {
    System.out.println("Printing static variable:" + MyStaticMember.a);
    MyStaticMember.sample();
   }

   public static void sample()
   {
    System.out.println("static method sample...");
   }
}