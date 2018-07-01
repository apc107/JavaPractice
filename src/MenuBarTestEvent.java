// MenuBar及選項判斷程式

import java.awt.*;
import java.awt.event.*;

class MenuBarTestEvent extends Frame implements
      ActionListener,ItemListener,WindowListener {

    MenuBar mb;            //宣告各物件變數
    Menu m1,m2,m3,m4,m11;
    MenuItem m13,m21,m22,m23,m31,m32,m41;
    CheckboxMenuItem m12;

    public static void main(String args[]) {
       MenuBarTestEvent test=new MenuBarTestEvent();
       test.add(new TextArea(),"Center"); //將文字區域放入視窗中
       test.go();
    }

    public void go() {

       addWindowListener(this); // open Window Event

       mb=new MenuBar();        // create all menu item
       m1=new Menu("檔案");
       m2=new Menu("編輯");
       m3=new Menu("工具");
       m4=new Menu("求助");

       m11=new Menu("開新檔案");
       m11.add("資料夾");
       m11.add("捷徑");
       m13=new MenuItem("關閉");
       m12=new CheckboxMenuItem("狀態列");
       m1.add(m11);
       m1.add(m12);
       m1.add(m13);


       m21=new MenuItem("復原");
       m22=new MenuItem("剪下");
       m23=new MenuItem("貼上");
       m2.add(m21);
       m2.add(m22);
       m2.add(m23);

       m31=new MenuItem("字典");
       m32=new MenuItem("計算");
       m3.add(m31);
       m3.add(m32);

       m41=new MenuItem("說明");
       m4.add(m41);

       mb.add(m1);
       mb.add(m2);
       mb.add(m3);
       mb.add(m4);

       m32.addActionListener(this); //偵測是否選擇該項功能
       m13.addActionListener(this);
       m12.addItemListener(this);   //只能用在checkbox,不能用在menu

       setMenuBar(mb);              //將mb設成test的選單列
       setSize(400,300);
       setVisible(true);
  }

  public void actionPerformed(ActionEvent e) {
    String str;
    str=e.getActionCommand();
    if ( str=="關閉")  {System.exit(0);}
    else if ( str=="計算") {System.out.println("呼叫計算器");};

  }

  public void itemStateChanged(ItemEvent e) {
    if (e.getStateChange()==ItemEvent.SELECTED) {
       setTitle("選了"); }
  }

  public void windowClosing(WindowEvent e) {
     System.exit(0);  //關閉視窗
  }


  public void windowClosed(WindowEvent e){};
  public void windowActivated(WindowEvent e) {};
  public void windowDeactivated(WindowEvent e) {};
  public void windowDeiconified(WindowEvent e) {};
  public void windowIconified(WindowEvent e) {};
  public void windowOpened(WindowEvent e) {}
}