//���g�c Maze.java
import java.awt.*;
import java.applet.Applet;
public class Maze extends Applet implements Runnable
{
   int maze[][]=       // �g�c
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
   int dx[]={1,0,-1,0,1,0,-1}; //x���ʳ��
   int dy[]={0,1,0,-1,0,1,0};  //y���ʳ��
   int dd[]={3,0,1,2,3,0,1};   //���ʤ�V
   Image image;                //�p�ϥ�    
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
               if (maze[r][c]==0) //�J���ê�ɧ��ܤ�V
               {
                  x=c;
                  y=r;
                  d=j%4;  // 3�W,1�U,2��,0�k
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
       // �e�g�c
       g.setColor(Color.blue);  
       for (int c=0; c<10; c++)
       {
          for (int r=0; r<10; r++)
          {
             if (maze[r][c]==1)
                 g.fillRect(15+40*c,15+40*r,40,40);
          }
       }
       // �e�p�ϥ�         
       g.drawImage(image,16+40*x,16+40*y,
                   image.getWidth(this),
                   image.getHeight(this),this);
       g.drawString("Walk("+x+","+y+")"+d,40,450);
    }
 }      
                             
   
      