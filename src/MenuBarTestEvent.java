// MenuBar�οﶵ�P�_�{��

import java.awt.*;
import java.awt.event.*;

class MenuBarTestEvent extends Frame implements
      ActionListener,ItemListener,WindowListener {

    MenuBar mb;            //�ŧi�U�����ܼ�
    Menu m1,m2,m3,m4,m11;
    MenuItem m13,m21,m22,m23,m31,m32,m41;
    CheckboxMenuItem m12;

    public static void main(String args[]) {
       MenuBarTestEvent test=new MenuBarTestEvent();
       test.add(new TextArea(),"Center"); //�N��r�ϰ��J������
       test.go();
    }

    public void go() {

       addWindowListener(this); // open Window Event

       mb=new MenuBar();        // create all menu item
       m1=new Menu("�ɮ�");
       m2=new Menu("�s��");
       m3=new Menu("�u��");
       m4=new Menu("�D�U");

       m11=new Menu("�}�s�ɮ�");
       m11.add("��Ƨ�");
       m11.add("���|");
       m13=new MenuItem("����");
       m12=new CheckboxMenuItem("���A�C");
       m1.add(m11);
       m1.add(m12);
       m1.add(m13);


       m21=new MenuItem("�_��");
       m22=new MenuItem("�ŤU");
       m23=new MenuItem("�K�W");
       m2.add(m21);
       m2.add(m22);
       m2.add(m23);

       m31=new MenuItem("�r��");
       m32=new MenuItem("�p��");
       m3.add(m31);
       m3.add(m32);

       m41=new MenuItem("����");
       m4.add(m41);

       mb.add(m1);
       mb.add(m2);
       mb.add(m3);
       mb.add(m4);

       m32.addActionListener(this); //�����O�_��ܸӶ��\��
       m13.addActionListener(this);
       m12.addItemListener(this);   //�u��Φbcheckbox,����Φbmenu

       setMenuBar(mb);              //�Nmb�]��test�����C
       setSize(400,300);
       setVisible(true);
  }

  public void actionPerformed(ActionEvent e) {
    String str;
    str=e.getActionCommand();
    if ( str=="����")  {System.exit(0);}
    else if ( str=="�p��") {System.out.println("�I�s�p�⾹");};

  }

  public void itemStateChanged(ItemEvent e) {
    if (e.getStateChange()==ItemEvent.SELECTED) {
       setTitle("��F"); }
  }

  public void windowClosing(WindowEvent e) {
     System.exit(0);  //��������
  }


  public void windowClosed(WindowEvent e){};
  public void windowActivated(WindowEvent e) {};
  public void windowDeactivated(WindowEvent e) {};
  public void windowDeiconified(WindowEvent e) {};
  public void windowIconified(WindowEvent e) {};
  public void windowOpened(WindowEvent e) {}
}