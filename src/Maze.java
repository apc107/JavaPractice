//走迷宮 Maze.java
import java.awt.*;
import java.applet.Applet;
public class Maze extends Applet implements Runnable
{
   int maze[][]=       // 迷宮
     {{1,1,1,1,1,1,1,1,1,1},
      {0,0,1,0,0,1,0,1,0,1},
      {1,0,0,1,0,1,0,0,0,1},
      {1,1,0,0,0,0,0,1,0,1},
      {1,0,0,1,1,0,1,0,0,1},
      {1,1,0,0,0,0,0,0,1,1},
      {1,1,0,0,1,0,1,1,1,1},
      {1,0,0,0,0,1,0,0,0,0},
      {1,0,1,1,0,0,0,1,0,1},
      {1,1,1,1,1,1,1,1,1,1}};
   int x=0,y=1,ox=9,oy=8,d=0;
   int dx[]={1,0,-1,0,1,0,-1}; //x移動單位
   int dy[]={0,1,0,-1,0,1,0};  //y移動單位
   int dd[]={3,0,1,2,3,0,1};   //移動方向
   Image image;                //小圖示    
   Thread myThread=null;
   public void init()
   {
      setSize(500,500);
      image=getImage(getDocumentBase(),"duke.gif");
   }   
   public void start()
   {
      myThread=new Thread(this);
      myThread.start();
   }
   public void run()
   {
      int r,c;
      while ((x!=ox) || (y!=oy))
      {
         repaint();
         try { 
            for (int j=dd[d]; j<7; j++)
            {
               c=x+dx[j];
               r=y+dy[j];
               if (maze[r][c]==0) //遇到阻礙時改變方向
               {
                  x=c;
                  y=r;
                  d=j%4;  // 3上,1下,2左,0右
                  break;
               }
            }
            myThread.sleep(500);
         }catch(InterruptedException e){}
       }
       System.out.println("Done");
    }
    public void paint(Graphics g)
    {
       // 畫迷宮
       g.setColor(Color.blue);  
       for (int c=0; c<10; c++)
       {
          for (int r=0; r<10; r++)
          {
             if (maze[r][c]==1)
                 g.fillRect(15+40*c,15+40*r,40,40);
          }
       }
       // 畫小圖示         
       g.drawImage(image,16+40*x,16+40*y,
                   image.getWidth(this),
                   image.getHeight(this),this);
       g.drawString("Walk("+x+","+y+")"+d,40,450);
    }
 }      
                             
   
      