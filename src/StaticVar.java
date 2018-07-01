class StaticVar
{
   private static int x=10;
   public static void main(String args[])
   {
      StaticVar s1=new StaticVar();
      s1.x++;
      StaticVar s2=new StaticVar();
      s2.x=s2.x+2;
      s1=new StaticVar();
      s1.x++;
      System.out.println("x= "+x);
      System.out.println(StaticVar.x);
    }
}
