class grandfather
{
   grandfather()
   {
      System.out.println("1");
   }
}

class father extends grandfather
{
   int x=10;
   father()
   {
      System.out.println("2");
   }
}

class son extends father
{
   int x=20;
   son()
   {
      System.out.println("3");

   }

   void p1()
   {
      System.out.println(x);
      System.out.println(super.x);
      System.out.println(this.x);
   }
   public static void main(String args[])
   {
      new son().p1();

   }
}
