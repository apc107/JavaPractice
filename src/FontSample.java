import java.awt.*;
class FontSample {
   public static void main(String args[]) {
     String s1="Font";
     String fontList[] =GraphicsEnvironment
                      .getLocalGraphicsEnvironment()
                      .getAvailableFontFamilyNames();
     int i,y=10;

     Frame f=new Frame();
     f.setSize(380,1000);
     f.setVisible(true);
     Graphics g=f.getGraphics();

     for (i=0; i<fontList.length; i++)
     {
     	g.setFont(new Font(fontList[i],1, 12));
     	g.drawString(fontList[i],10,y);
        g.drawString(s1,200,y);
        y+=15;
        //System.out.println(fontList[i]);
      }
   }
}