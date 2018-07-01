import java.awt.*;
public class DialogTest extends Frame {
   public static void main(String args[]) {
      DialogTest f=new DialogTest();
      Dialog dlg=new Dialog(f,"對話盒標題",true);
      dlg.setSize(240,150);
      f.setSize(300,300);
      f.setVisible(true);
      dlg.setVisible(true);
      //dlg.show();
   }
}
