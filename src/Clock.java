// Clock.java 指針馬錶
import java.awt.*;
import java.awt.event.*;
public class Clock extends Frame implements Runnable
{
   aLine myline;
   int angle=0;
   int mode=-6; //每秒角度改變幅度=360/60
   int x,y;
   int i=1;
   public void run()
   {
      while (true)
      {
      	 repaint();
      	 try {
      	 	Thread.sleep(1000);
      	 } catch (InterruptedException e){}
      }
   }
   public Clock()
   {
      super("Clock");
      setSize(300,300);
      x=getBounds().width/2;    // x,y 鐘的中心點
      y=getBounds().height/2;
      myline=new aLine(x);
      addWindowListener(new WindowAdapter()
      {
         public void windowClosing(WindowEvent e)
         {
            System.exit(0);
         }
      });
      setVisible(true);
   }
   public void paint(Graphics g)
   {
      String second=Integer.toString(i=++i%60);
      myline.rotate(angle,x,y);
      angle+=mode;
      if ( angle>360 ) angle=angle-360;
      g.setColor(Color.black);
      g.fillOval(x-4,y-4,8,8);
      g.drawOval(x-80,y-80,160,160);
      g.drawLine(x,y,myline.rx,myline.ry);
      g.drawString("Time:"+second,50,50);  // 顯示秒數
   }
   public static void main(String args[])
   {
      Clock c=new Clock();
      Thread mythread=new Thread(c);
      mythread.start();
   }
}
class aLine
{
   int x,y,rx,ry,maxval;

   aLine(int ox)
   {
      maxval=65;  // 設定指針長度
      y=x=ox-maxval;
   }
   void rotate(int angle, int ox, int oy)
   {
      float radian;
      while (angle<0) angle+=360;
      angle=angle%360;
      radian=angle*0.017453F; //角度轉換為弧度
      x=rx;
      y=ry;
      rx=(int)(maxval*Math.sin(radian))+ox;
      ry=(int)(maxval*Math.cos(radian))+oy;
   }
}