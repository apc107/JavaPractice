//作業：面積計算
public class Area1
{  // 主程式
   public static void main(String args[])
   {  // 常數宣告
      final double PI = 3.1415926;
      // 變數宣告
      double area;
      double w=10,h=20,l=15,v=0;
      double r = 20.0,x=10,y=0;
      // 計算面積
      area = PI * r * r;
      v=area*h;
      // 顯示訊息
      System.out.println("圓面積: ");
      System.out.println(area);
      System.out.print("圓體積: ");
      System.out.println(v);
      System.out.println("y="+(x*x+5*x+3));
   }
}