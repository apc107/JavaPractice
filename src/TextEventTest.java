import java.awt.*;
import java.awt.event.*;
//是Frame同時也是TextListener
public class TextEventTest extends Frame implements TextListener {
  private TextField tf1,tf2,tf3;
  public static void main(String args[]) {
    TextEventTest test=new TextEventTest();
    test.setSize(300,200);
    test.setVisible(true);
  }

  public TextEventTest() {  //建構子
    setLayout(new GridLayout(3,1));
    tf1=new TextField();
    tf1.addTextListener(this);  //讓tf1能夠處理事件
    tf2=new TextField();
    tf3=new TextField();
    add(tf1);
    add(tf2);
    add(tf3);
  }

  public void textValueChanged(TextEvent e) {  //實作TextListener的method
    tf2.setText(tf1.getText());  //將tf1裡的字串設定給tf2
    tf3.setText(tf1.getText());
  }
}
